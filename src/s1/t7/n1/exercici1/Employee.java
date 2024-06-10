package s1.t7.n1.exercici1;

public class Employee {
    private final String name;
    private final String surname;
    private final double hourlyRate;

    public Employee(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}