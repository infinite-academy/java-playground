package s1.t3.n1.exercici1;

import java.util.HashSet;
import java.util.Iterator;

public class GregorianYear extends Year {
    private final HashSet<Month> months = new HashSet<>(12);
    private final int cardinal;

    public GregorianYear(int cardinal) {
        // You can't just super(cardinal) because it'll just operate on year.months, not gregYear.months;
        this.cardinal = cardinal;
        for (Months month : Months.values()) {
            this.months.add(new Month(month));
        }
    }

    @Override
    public void printCalendar() {
        System.out.println("Gregorian Year calendar ---- " + cardinal + " ----");
        for (Iterator<Month> i = this.months.iterator(); i.hasNext();) {
            Month month = i.next();
            System.out.println(month.name + " " + (month.ordinal + 1));
        }
        System.out.println("Size: " + months.size());
    }

    @Override
    public boolean addMonth(Month month) {
        return this.months.add(month);
    }
}