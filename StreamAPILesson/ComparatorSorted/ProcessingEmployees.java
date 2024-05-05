package StreamAPILesson.ComparatorSorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //Comparator.comparing in Object
        Stream<Employee> result = list.stream()
                .sorted(Comparator.comparing(Employee::getLastName));
        System.out.println(result.collect(Collectors.toList()));

        //Compartor.comparing & thenComparing in Object
        //You can have only one comparing but you can have many thenComparing as you want
        Stream<Employee> lastNameSalary = list.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getSalary));
        System.out.println(lastNameSalary.collect(Collectors.toList()));

        //Collectors.joining
        String resultTwo = list.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .map(Employee::toString)
                .collect(Collectors.joining(","));
        System.out.println(resultTwo);
    }
}
