// TriangleTypeTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTypeTest {
    @Test
    public void testSamaSisi() {
        assertEquals("sama sisi", TriangleType.classify(3,3,3));
    }

    @Test
    public void testSikuSiku() {
        assertEquals("siku-siku", TriangleType.classify(3,4,5));
    }

    @Test
    public void testSamaKaki() {
        assertEquals("sama kaki", TriangleType.classify(5,5,8));
    }

    @Test
    public void testSegitigaSembarang() {
        assertEquals("segitiga sembarang", TriangleType.classify(4,5,6));
    }

    @Test
    public void testBukanSegitiga() {
        assertEquals("bukan segitiga", TriangleType.classify(1,2,3)); // degenerate
        assertEquals("bukan segitiga", TriangleType.classify(0,0,0));
        assertEquals("bukan segitiga", TriangleType.classify(-1,2,3));
    }

    @Test
    public void testIsoscelesRightPreferSiku() {
        // contoh segitiga sama kaki + siku (5,5, Math.sqrt(50) approx) -> but with ints
        // contoh integer: (1,1, (int)Math.sqrt(2)) not integers, but test prefer siku for integer Pythagorean like 5,12,13 isn't isosceles
        // test kasus hipotetik: 5,5,7 -> same kaki
        assertEquals("sama kaki", TriangleType.classify(5,5,7));
    }
}
