import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeInput {
    public static void main(String[] args) {
        // create a new Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // create a new ArrayList to store Employee objects
        ArrayList<Employee> employees = new ArrayList<>();
        while (true) {
            // prompt the user to enter employee details or exit the program
            System.out.println("Enter employee details (name, role, salary) or type 'quit' to terminate the program: ");

            // read the user's input from the console
            String input = scanner.nextLine();

            // check if the user has entered 'quit' to exit the program
            if (input.equals("quit")) {
                // sort the employees ArrayList using the Employee class's natural ordering
                Collections.sort(employees);
                // Loop through each Employee object in the employees ArrayList and print out their details
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                // exit the while loop and terminate the program
                break;
            }

            // split the user's input into an array of strings using whitespace as the delimiter
            String[] details = input.split("\\s+");

            // check that the user has entered exactly three values
            if (details.length != 3) {
                System.out.println("Error: Please enter exactly three values.");
                continue;
            }

            // extract the name, role, and salary values from the user's input
            String name = details[0];
            String role = details[1];
            double salary;
            try {
                salary = Double.parseDouble(details[2]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid salary value.");
                continue;
            }

            // check if the name and role fields contain any digits
            if (name.matches(".*\\d.*") || role.matches(".*\\d.*")) {
                System.out.println("Error: Name and role fields cannot contain numbers.");
                continue;
            }

            // create a new Employee object with the extracted details and add it to the employees ArrayList
            Employee employee = new Employee(name, role, salary);
            employees.add(employee);
        }

        // close the scanner object
        scanner.close();
    }
}
