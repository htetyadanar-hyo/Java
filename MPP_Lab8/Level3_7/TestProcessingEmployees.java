package MPP_Lab8.Level3_7;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestProcessingEmployees {
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
        //Display all Employees
        System.out.println("Complete lists Employee");
        list.stream()
                .forEach(System.out::println);

        // Display Employees with salaries in the range $4000-$6000
        // sorted into ascending order by salary
        Predicate<Employee> fourToSix =
                e -> (e.getSalary()>=4000 && e.getSalary()<=6000);
        System.out.printf("Employee earning $4000-$6000 per month sorted by salary:%n");
        list.stream()
                .filter(fourToSix)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        //Display Unique Employee LastName Sorted
        System.out.printf("%nUnique employee last names:%n");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //Test FindFirst
        // Display first Employee with salary in the range $4000-$6000
        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSix)
                        .findFirst()
                        .get());

        Comparator<Employee> lastThenFirst =
                Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName);

        System.out.println("Employees in ascending order by last name then first");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        System.out.println("Employees in descending order by last name then first");
        list.stream()
                .sorted(lastThenFirst.reversed())
                        .forEach(System.out::println);

        // display only first and last names
        System.out.printf(
                "%nEmployee names in order by last name then first name:%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        //

        //group Employees by department
        System.out.printf("%nEmployees by department:%n");
        Map<String,List<Employee>> groupedByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach(
                (dept,employ) -> {
                System.out.println(dept);
                employ.forEach(
                        e -> System.out.printf("   %s%n", e));
        });

        // count number of Employees in each department
        Map<String,Long> employeeCountByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                TreeMap::new,Collectors.counting()));
        employeeCountByDepartment.forEach(
                (department,count)->System.out.printf("%s has %d employee(s)%n",department,count)
        );

        // sum of Employee salaries with DoubleStream sum method
        System.out.printf(
                "%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum());

    }
}
