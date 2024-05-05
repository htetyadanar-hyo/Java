package StreamAPILesson.toMap_GroupingBy;

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

        Map<String,Double> nameToSalary =
                list.stream().collect(Collectors.toMap(Employee::getName,Employee::getSalary));
        nameToSalary.forEach(
                (name,salary)->System.out.println(name + " " + salary)
        );
        System.out.println("...........");
        Map<String,Double> departementToSalary =
                list.stream()
                        .collect(Collectors.toMap(Employee::getDepartment,
                                Employee::getSalary,
                                Double::sum));
        departementToSalary.forEach(
                (department,salary)->System.out.println(department + " " + salary)
        );
        //c)  Print out each department and all of the employees who work at that department.
        System.out.println("...........");
        Map<String, List<Employee>> employeeByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                TreeMap::new,Collectors.toList()));
        employeeByDepartment.forEach((department, employee) -> {
            System.out.println(department);
            employee.forEach(e -> System.out.print(e + " "));
            System.out.println();
        });
    }
}
