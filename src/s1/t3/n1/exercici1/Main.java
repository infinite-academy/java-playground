package s1.t3.n1.exercici1;

public class Main {
    void main() {
        Month august = new Month(Months.august);
        // Init year empty and fill manually according to instruction.
        Year year = new Year();
        for(Months month : Months.values()){
            if(month != Months.august){
                year.addMonth(new Month(month));
            }
        }
        // Print year's contents missing August
        year.printCalendar();
        // Add missing august and print
        year.addMonth( 7, august);
        year.printCalendar();
        // Try to duplicate August. No error.
        year.addMonth( 7, august);
        // Now we'll use an extension of Year that implements a HashSet instead of an ArrayList
        GregorianYear gregorianYear = new GregorianYear(2024);
        gregorianYear.printCalendar();
        // You can tell HashSet does not make guarantees for ordering.  Here I try to add a duplicate 
        System.out.println("Added duplicate august to Gregorian Year 2024: " + gregorianYear.addMonth(august));
        gregorianYear.printCalendar();
    }
}
