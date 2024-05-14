package s1.t3.n1.exercici1;

import java.util.HashSet;
import java.util.Iterator;

class GregorianYear extends Year {
    private HashSet<Month> months = new HashSet<Month>(12);
    private int cardinal;

    
    GregorianYear(int cardinal) {
        // You can't just super(cardinal) because it'll just operate on year.months, not gregYear.months;
        this.cardinal = cardinal;
        for(Month.MONTHS month : Month.MONTHS.values()){
                this.months.add(new Month(month));
        }
    }

    void printCalendar(){
        System.out.println("Gregorian Year calendar ---- " + cardinal + " ----");
        for(Iterator<Month> i = this.months.iterator(); i.hasNext();){
            Month month = i.next();
            System.out.println(month.name + " " + (month.ordinal + 1));
        }
        System.out.println("Size: " + months.size());
    }

    boolean addMonth(Month month){
        return this.months.add(month);
    }
}