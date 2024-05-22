package t4.n1.exercici3;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionTest {
    @Test
    public void testArrayIndexOutOfBoundsException() {
        Thrower thrower = new Thrower();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> thrower.throwArrayIndexOutOfBoundsException());
    }
}


