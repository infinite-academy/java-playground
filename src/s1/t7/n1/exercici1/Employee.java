package s1.t7.n1.exercici1;

public class Employee {
    private String name;
    private String surname;
    private double hourlyRate;

    public Employee(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }
}