// SquaresPositionTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquaresPositionTest {
    @Test
    public void testInside() {
        // contoh di soal: (3,8,s1=5) dan (5,6,s2=2) -> inside
        assertEquals("inside", SquaresPosition.getPosition(3, 8, 5, 5, 6, 2));
    }

    @Test
    public void testIntersect() {
        // overlap sebagian
        assertEquals("intersect", SquaresPosition.getPosition(0, 5, 5, 4, 2, 3));
    }

    @Test
    public void testOutside() {
        // tidak beririsan
        assertEquals("outside", SquaresPosition.getPosition(0, 5, 5, 6, 6, 2));
    }

    @Test
    public void testTouchingCountsAsIntersect() {
        // menyentuh di tepi
        assertEquals("intersect", SquaresPosition.getPosition(0, 5, 5, 5, 5, 2)); // right1 == left2
    }
}
