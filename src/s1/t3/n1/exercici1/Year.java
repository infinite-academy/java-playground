package s1.t3.n1.exercici1;

import java.util.ArrayList;

public class Year {
    // For the gregorian year we know this could be a simpler Array with 12 places. 
    // ArrayList is used here for flexibility and to implement exercise logic.
    // technicaly some of this logic could be reused(Year is modeled as collection of Months with Extra info. You could extend it to model a chinese year)
    private final ArrayList<Month> year = new ArrayList<Month>(12);
    private int cardinal;

    public Year(int cardinal) {
        this.cardinal = cardinal;
        for(Month.MONTHS month : Month.MONTHS.values()){
                year.add(new Month(month));
        }
    }
    public int getCardinal() {
        return cardinal;
    }
    public void setCardinal(int cardinal) {
        this.cardinal = cardinal;
    }
    public ArrayList<Month> getYear() {
        return year;
    }
    
    public void printCalendar(){
        for(Month month : year){
            System.out.println("Year calendar ---- " + cardinal + " ----");
            System.out.println(month.name + " " + month.ordinal + 1);
        }
    }

    public void addMonth(Month month, int index){
        year.add(index, month);
    }

    public boolean addMonth(Month month){
        return year.add(month);
    }


}
