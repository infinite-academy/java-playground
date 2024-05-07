package s1.t3.n1.exercici2;

import java.util.ArrayList;
import s1.t3.n1.exercici1.Month;


public class Main {
    final ArrayList<Month> year = new ArrayList<Month>(11);
    void main(String[] args) {
        /*  
        Using enums here because it's baked into Month's design and simplifies this demonstration
        Alternatively I could've using a for with indexes, forEach or even write out `new Month(Month.MONTHS.monthName)` x12 or literally any other way of iterating.
        I prefer enums. They're specially cool in Java from what i can tell(cool for implementation)
        */
        for(Month.MONTHS month : Month.MONTHS.values()){
            if(month != Month.MONTHS.august){
                year.add(new Month(month));
            }
        }
        // Both this and some other logic in this Main could/should be extracted into a class Year. It'd prevent code duplication on printing the year and even could handle all the ArrayList logic. Basically this could be called once to return a ready Year with full calendar, drop the month august and theb add it back. So 3 lines instead of all of these.
        for(Month month : year){
            System.out.println("Year calendar ----");
            System.out.println(month.name + " " + month.ordinal + 1);
        }
        year.add( 7,new Month(Month.MONTHS.august));
        for(Month month : year){
            System.out.println("Year calendar ----");
            System.out.println(month.name + " " + month.ordinal + 1);
        }


    }
}

