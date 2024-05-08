package s1.t3.n1.exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


 class Year {
    // For the gregorian year we know this could be a simpler Array with 12 places. 
    // ArrayList is used here for flexibility and to implement exercise logic.
    // technicaly some of this logic could be reused(Year is modeled as collection of Months with Extra info. You could extend it to model a chinese year)
    private final ArrayList<Month> months = new ArrayList<Month>(12);
    private int cardinal;

    Year(){};
    Year(int cardinal) {
        this.cardinal = cardinal;
        for(Month.MONTHS month : Month.MONTHS.values()){
                this.months.add(new Month(month));
        }
    }
    
    int getCardinal() {
        return cardinal;
    }
    void setCardinal(int cardinal) {
        this.cardinal = cardinal;
    }
    
    void printCalendar(){
        System.out.println("Year calendar ---- " + cardinal + " ----");
        for(Iterator<Month> i = this.months.iterator(); i.hasNext();){
            Month month = i.next();
            System.out.println(month.name + " " + (month.ordinal + 1));
        }
        System.out.println("Size: " + months.size());
    }

    void addMonth(int index, Month month){
        this.months.add(index, month);
    }

    boolean addMonth(Month month){
        return this.months.add(month);
    }
}


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