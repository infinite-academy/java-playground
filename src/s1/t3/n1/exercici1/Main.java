package s1.t3.n1.exercici1;

import java.util.ArrayList;


public class Main {
    void main(String[] args) {
        final ArrayList<Month> year = new ArrayList<Month>(11);
        
        for(Month.MONTHS month : Month.MONTHS.values()){
            if(month != Month.MONTHS.august){
                year.add(new Month(month));
            }
        }
        // Both this and some other logic in this Main could/should be extracted into a class Year. It'd prevent code duplication on printing the year and even could handle all the ArrayList logic. Basically this could be called once to return a ready Year with full calendar, drop the month august and theb add it back. So 3 lines instead of all of these.
        System.out.println("Year calendar ----");
        for(Month month : year){
            System.out.println(month.name + " " + (month.ordinal + 1));
        }
        year.add( 7,new Month(Month.MONTHS.august));
        System.out.println("Year calendar ----");
        for(Month month : year){
            System.out.println(month.name + " " + (month.ordinal + 1));
        }
    }
}
