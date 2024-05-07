package s1.t3.n1.exercici1;

public class Month {
    // This enum guarantees safety when creating months for the gregorian calendar
    public static enum MONTHS  {
        january,
        february,
        march,
        april,
        may,
        june,
        july,
        august,
        september,
        october,
        november,
        december
    };
    public final String name;
    public final int ordinal;

    public Month(MONTHS month) {
        this.name = month.toString();
        this.ordinal = month.ordinal();
    }
}

