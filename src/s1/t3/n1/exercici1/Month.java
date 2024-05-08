package s1.t3.n1.exercici1;

import java.util.Objects;

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

    @Override
	public int hashCode() {
		return Objects.hash(name, ordinal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name) && Objects.equals(name, other.name);
	}

}

