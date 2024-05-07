package s1.t3.n1.exercici1;

class Month {
    // This enum guarantees safety when creating months for the gregorian calendar
    static enum MONTHS  {
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
    final String name;
    final int ordinal;

    Month(MONTHS month) {
        this.name = month.toString();
        this.ordinal = month.ordinal();
    }
}

