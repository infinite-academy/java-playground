package t4.n1.exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    String[] months = new String[12];
    Year year = new Year(months);

    @Test void yearHas12Months() {
        assertTrue(year.months.length == 12);
    }

    @Test void yearNotNull() {
        assertNotNull(year.months);
    }

    @Test void yearHasAugust() {
        assertTrue(year.months[7] == "August");
    }
}
