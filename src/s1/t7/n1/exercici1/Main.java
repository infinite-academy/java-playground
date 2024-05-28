package s1.t7.n1.exercici1;

public class Main {
    public static void main(String[] args) {
        // Set the gas allowance for all OnsiteEmployees
        OnsiteEmployee.gasAllowance = 50.0; // Assuming a gas allowance of $50

        // Create an onsite employee
        OnsiteEmployee onsiteEmployee = new OnsiteEmployee("John", "Doe", 20.0); // Hourly rate: $20

        // Create an online employee
        OnlineEmployee onlineEmployee = new OnlineEmployee("Jane", "Smith", 25.0); // Hourly rate: $25

        // Calculate and print the salaries for different hours worked
        System.out.println("Onsite Employee Salary (40 hours): $" + onsiteEmployee.calculateSalary(40));
        System.out.println("Online Employee Salary (30 hours): $" + onlineEmployee.calculateSalary(30));
    }
}