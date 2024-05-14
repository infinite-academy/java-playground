package t4.n1.exercici2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculoDniTest {
    @ParameterizedTest
    @ValueSource(strings = { "Z1221221V", "Z12345678A" })
    // @CsvFileSource(resources = "/one-column.csv", numLinesToSkip = 1)
    void calculoDni(String candidate) {
        CalculoDni dni = new CalculoDni(candidate);
        for (int index = 0; index < candidate.length() - 1; index++){
            assertTrue(dni.calcularLetra(index) == candidate.charAt(index));
        }
    }
}


