package MPP_Lab8.Ex4;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class ProcessingEmployees {
    public static void main(String[] args)
    {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);   //A method reference.

        // To test Collectors.joining
        // Convert elements to strings and concatenate them, separated by commas
        String joined = list.stream()
                //.map(Object::toString)  //  this DOES go to the overridden method  toString  inside Employee!!  Yes!!
                //  joining method needs Strings coming in.
                .map(Employee::toString)  //  this also DOES work!!  Yes!!
                .collect(Collectors.joining(", "));
        System.out.println("\n\n" + joined);

        Predicate<Employee> lastNameWithB =
                e -> e.getLastName().charAt(0) == 'B';
        System.out.println("4/All Employee objects with lastName begins with 'B',then capitalize LastName");
        list.stream()
                .map(e -> {
                    if(e.getLastName().startsWith("B")){
                        return new Employee(e.getFirstName(),e.getLastName().toUpperCase(),e.getSalary(),e.getDepartment());
                    }
                    return e;
                })
                .forEach(System.out::println);

        System.out.println("4.1/All Employee objects with lastName begins with 'B',then capitalize LastName by using Collector.joining Method");
        String joinEmployee = list.stream()
                .map(e -> {
                    if(e.getLastName().startsWith("B")){
                        return new Employee(e.getFirstName(),e.getLastName().toUpperCase(),e.getSalary(),e.getDepartment()).toString();
                    }
                    return e.toString();
                }).collect(Collectors.joining(","));
        System.out.println(joinEmployee);

        System.out.println("4.2/All Employee objects with lastName begins with 'B',then capitalize LastName by using Collector.joining Method and Separate by delimeter");
        String joinEmployeeTwo = list.stream()
                .map(e -> {
                    if(e.getLastName().startsWith("B")){
                        return new Employee(e.getFirstName(),e.getLastName().toUpperCase(),e.getSalary(),e.getDepartment()).toString();
                    }
                    return e.toString();
                })
                .collect(Collectors.joining("---\n---"));
        System.out.println(joinEmployeeTwo);

        System.out.println("Print all employees and capitalize the ones that starts with 'B'");
        list.stream()
                .forEach(e->{
                            if(e.getLastName().startsWith("B")){
                                e.setLastName(e.getLastName().toUpperCase());
                            }
                            System.out.println(e);
                        }
                );
    } // end main
}
