package MPP_Lab8.Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

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

        Predicate<Employee> lastNameWithB =
                e -> e.getLastName().charAt(0) == 'B';
//        System.out.printf("Count number of last names begin with 'B' & Print: %d %n",
//                list.stream()
//                    .filter(lastNameWithB)
//                    .count());

        System.out.println("Count number of last names begin with 'B' & Print:");
        long ct = list.stream()
                .filter(lastNameWithB)
                .count();
        System.out.println(ct);

        System.out.println("All employees with 'B' in sorted order");
        list.stream()
                .filter(lastNameWithB)
                .sorted(Comparator.comparing(Employee::getLastName))
                .forEach(System.out::println);

        System.out.println("All employees with 'B' and change firstName and lastName to capital Letter/Not Change Original");
        list.stream()
                .filter(lastNameWithB)
                .map(e -> new Employee(e.getFirstName().toUpperCase(),e.getLastName().toUpperCase(),e.getSalary(),e.getDepartment()))
                .forEach(System.out::println);

        System.out.println("All employees with 'B' and change firstName and lastName to capital Letter/Change Original");
        list.stream()
                .filter(lastNameWithB)
                .forEach(e -> {
                    e.setFirstName(e.getFirstName().toUpperCase());
                    e.setLastName(e.getLastName().toUpperCase());
                    System.out.println(e);
                });

        Predicate<Employee> lastNameWithI =
                e -> e.getLastName().charAt(0) == 'I';
        System.out.println("All Employee lastnames with 'I' in sorted order, remove duplicate");
        list.stream()
                .filter(lastNameWithI)
                .map(Employee::getLastName)
                .distinct()
                .forEach(System.out::println);

        System.out.printf("Average of all salaries: $%,.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0.0)
                );

        System.out.printf("Total of all salaries by using reduce method: $%,.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        //.reduce((x,y)->(x+y))
                        .reduce(Double::sum)
                        .orElse(0.0)
                );

        System.out.println("First Names of all employees: ");
        list.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);

        System.out.println("Infinite Stream of even Numbers");
        Stream.iterate(0,n -> n + 2)
                .limit(20)
                .forEach(x -> System.out.print(x + " "));


    }
}
