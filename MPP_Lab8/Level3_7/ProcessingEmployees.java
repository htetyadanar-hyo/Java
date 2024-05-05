package MPP_Lab8.Level3_7;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        List<Employee> list = Arrays.asList(employees);

        //a)  Print out each department and the average salary for the department.
        System.out.println("Department and its average Salary");
        Map<String,Double> averageSalaryByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                TreeMap::new, Collectors.averagingDouble(Employee::getSalary)));

        averageSalaryByDepartment.forEach(
                (department,avgSalary)-> System.out.printf("%s has %,.2f%n",department,avgSalary)
        );
        System.out.println("_________________________");
        Map<String,List<Employee>> avgByDepartment =
                list.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment));
        avgByDepartment.forEach(
                (dep,emp)->{
                    System.out.printf(" %s: Avg Salary %,.2f %n",dep,
                            emp.stream()
                                    .mapToDouble(Employee::getSalary)
                                    .average()
                                    .orElse(0.0)
                    );
                }
        );

        System.out.println("_________________________");

        //b)  Print out each department and the maximum salary for the department.
        System.out.println("Department and its max Salary");
        Map<String,Double> maxSalaryByDepartment =
                list.stream()
                        .collect(Collectors.toMap(Employee::getDepartment,
                                        Employee::getSalary,
                                        Double::max));

        maxSalaryByDepartment.forEach(
                (department,max) -> {
                        System.out.println("Department Name:" + department + "," + max);
                }
        );
        avgByDepartment.forEach(
                (dep,max)->{
                    System.out.printf("Department: %s %,.2f %n",dep,
                            max.stream()
                                    .mapToDouble(Employee::getSalary)
                                    .max()
                                    .getAsDouble()
                    );
                }
        );

        //c)  Print out each department and all of the employees who work at that department.
        System.out.println("Department and All Employees who work at that department");
        Map<String,List<Employee>> employeesByEachDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                TreeMap::new,Collectors.toList()));
        employeesByEachDepartment.forEach((department,e)->
                {
                       System.out.println(department);
                       System.out.println(e);
                }
        );
        System.out.println("_________________________");
        System.out.println("Department and All Employees who work at that department");
        Map<String,List<Employee>> employeePerDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
        employeePerDepartment.forEach((department,e)->
                {
                    System.out.println(department);
                    e.forEach(i-> System.out.printf(" %s %n",i));
                }
        );

    }
}
