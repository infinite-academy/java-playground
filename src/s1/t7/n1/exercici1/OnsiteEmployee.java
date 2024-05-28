package s1.t7.n1.exercici1;

public class OnsiteEmployee extends Employee {
    // Static attribute for gas allowance
    public static double gasAllowance;

    public OnsiteEmployee(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + gasAllowance;
    }

    /**
     * Calculates salary including a fixed bonus.
     * 
     * @deprecated This method uses a fixed bonus which is no longer applicable.
     *             Use {@link #calculateSalary(int)} instead.
     */
    @Deprecated
    public double calculateSalaryWithBonus(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + 100; // Fixed bonus of 100
    }

}
