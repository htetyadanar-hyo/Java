package MPP_Lab8.Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Lason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        List<Employee> list = Arrays.asList(employees);

        list.stream()
                .filter(e->e.getSalary()>=4000 && e.getSalary()<=6000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);

        Predicate<Employee> lastNameBChecking =
                e -> (e.getLastName().charAt(0) == 'B');

        System.out.println("First Employee with salary in the range");
        System.out.printf(" %s%n",list.stream()
                .filter(e->e.getSalary()>=4000 && e.getSalary()<=6000)
                        .findFirst()
                                .get());
        System.out.printf(" %s%n",
        list.stream()
                .mapToDouble(Employee::getSalary)
               // .max()
                .min()
                .getAsDouble());
        System.out.println("Display only first and last names.Employee names in order by last name then first name");
        list.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName))
                .forEach(e->{
                    System.out.println(e.getFirstName()+ " " + e.getLastName());
                });

        System.out.printf("No.1/The number of last names that begin with 'B': %d%n",
                list.stream()
                        .filter(lastNameBChecking)
                        .count());

        System.out.println("No.2/Employee objects whose last name begins with the letter  ‘B’  in sorted order:");
        list.stream()
                .filter(lastNameBChecking)
                .sorted(Comparator.comparing(Employee::getLastName))
                .forEach(System.out::println);

        System.out.println("No.3/Change name to Capital Letters : Not Change Original Lists");
        list.stream()
                .filter(lastNameBChecking)
                .map(e -> new Employee(e.getFirstName().toUpperCase(),e.getLastName().toUpperCase(),e.getSalary(),e.getDepartment()))
                .forEach(System.out::println);

        System.out.println("No.3/Change name to Capital Letters: Change Original Lists");
        list.stream()
                .filter(lastNameBChecking)
                .forEach(e -> {
                    e.setFirstName(e.getFirstName().toUpperCase());
                    e.setLastName(e.getLastName().toUpperCase());
                    System.out.println(e);
                });
        System.out.println("______________________");
        list.stream()
                .filter(e->e.getLastName().startsWith("B"))
                .peek(e->{
                    e.setFirstName(e.getFirstName().toUpperCase());
                    e.setLastName(e.getLastName().toUpperCase());
                })
                .forEach(System.out::println);
        System.out.println("______________________");
        list.stream()
                .filter(e->e.getLastName().startsWith("B"))
                .map(e->{
                    e.setFirstName(e.getFirstName().toUpperCase());
                    e.setLastName(e.getLastName().toUpperCase());
                    return e;
                })
                .forEach(System.out::println);
        System.out.println("______________________");
        System.out.println("No.4/Find LastName begins with 'B' and capitailze All letters in Last Name");
        //implement
        Predicate<Employee> lastNameIChecking =
                e -> e.getLastName().charAt(0) == 'I';
        System.out.println("No.5/Print Out all Employee lastName whose last name begins with 'I' in sorted order, remove duplicates");
        list.stream()
                .filter(lastNameIChecking)
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("No.6/Average of all Salaries");
        double averageSalary = list.stream()
                                    .mapToDouble(Employee::getSalary)
                                    .average()
                                    .orElse(0.0);
        System.out.printf("%,.2f %n",averageSalary);


        System.out.println("No.7/Using reduce method to print out all total salary");
        double totalSalary = list.stream()
                                    .mapToDouble(Employee::getSalary)
                                    .reduce(0,Double::sum);
                                            //.reduce(0,(x,y)->(x+y));
        System.out.printf("%,.2f %n",totalSalary);

        System.out.printf("No.7/Testing %f %n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0,Double::sum));

        System.out.println("No.8/All First Names in Employees");
        list.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);


        System.out.println("No.9/Infinite Stream of even Numbers");
        Stream.iterate(0,n->n+2)
                .limit(20)
                .forEach(n->System.out.print(n + " "));

        System.out.println("Test/Infinite Stream of odd Numbers");
        List<Integer> result =Stream.iterate(1,n->n+2)
                .limit(20)
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println("Test/Infinite Stream of odd Numbers---");
        IntStream.iterate(0,n->(n+2)).limit(20).forEach(s->System.out.print(s + "/"));

        System.out.println("The max salary is: ");
        Optional<Double> largest =
                list.stream()
                        .map(Employee::getSalary)
                                .max(Comparator.naturalOrder());

        Optional<Employee> largestObject =
                list.stream().max(Comparator.comparing(Employee::getSalary));

        String firstNameStartsWithL =
                list.stream().map(Employee::getFirstName).filter(s->s.startsWith("L")).findFirst().orElse("Not Found");

        System.out.println(largest.get());
        System.out.println(largestObject.get());
        System.out.println(firstNameStartsWithL);

    }
}
