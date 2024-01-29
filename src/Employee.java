public class Employee implements Comparable<Employee> {
    private String role;
    private String name;
    private double salary;


    // define a constructor for the employee class that initialises the instance variables
    public Employee(String role, String name, double salary) {
        this.role = role;
        this.name = name;
        this.salary = salary;
    }

    // define getter methods for retrieving the role, name, salary of an employee
    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // overrides the compareTo() method to compare Employees by role, name, and salary
    @Override
    public int compareTo(Employee other) {
        // compares the roles of this and the other Employee
        int roleComparison = this.role.compareTo(other.role);
        // if the roles are different, returns their comparison
        if (roleComparison != 0) {
            return roleComparison;
        }
        // compares the names of this and the other Employee
        int nameComparison = this.name.compareTo(other.name);
        // if the names are different, returns their comparison
        if (nameComparison != 0) {
            return nameComparison;
        }
        // compares the salaries of this and the other Employee
        return Double.compare(this.salary, other.salary);
    }

    // overrides the toString() method to return a String representation of an Employee
    @Override
    public String toString() {
        // returns the Employee's role, name, and salary separated by spaces
        return role + " " + name + " " + salary;
    }
}

