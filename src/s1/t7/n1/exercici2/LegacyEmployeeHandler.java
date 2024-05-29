package s1.t7.n1.exercici2;

import s1.t7.n1.exercici1.OnlineEmployee;
import s1.t7.n1.exercici1.OnsiteEmployee;

public class LegacyEmployeeHandler {

    @SuppressWarnings("deprecation")
    public void handleLegacyCalculations() {
        OnsiteEmployee onsiteEmployee = new OnsiteEmployee("John", "Doe", 20.0);
        OnlineEmployee onlineEmployee = new OnlineEmployee("Jane", "Smith", 25.0);

        // Using deprecated methods
        System.out.println("Onsite Employee Salary (Deprecated): $" + onsiteEmployee.calculateSalaryWithBonus(40));
        System.out.println(
                "Online Employee Salary (Deprecated): $" + onlineEmployee.calculateSalaryWithReducedInternet(30));
    }
}
