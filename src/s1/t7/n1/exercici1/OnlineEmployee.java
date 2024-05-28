package s1.t7.n1.exercici1;

public class OnlineEmployee extends Employee {
    // Constant for internet fee
    public static final double INTERNET_FEE = 50.0;

    public OnlineEmployee(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + INTERNET_FEE;
    }
}
