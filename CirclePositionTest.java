// CirclePositionTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirclePositionTest {
    @Test
    public void testInside() {
        assertEquals("inside", CirclePosition.getPosition(5, 2, 1, 1)); // d~1.414, d+r2~3.414 <5
    }

    @Test
    public void testOutside() {
        assertEquals("outside", CirclePosition.getPosition(5, 1, 7, 0)); // d=7, d-r2=6 >5
    }

    @Test
    public void testIntersectTouching() {
        // touching or overlapping should be "intersect"
        assertEquals("intersect", CirclePosition.getPosition(5, 2, 3, 0)); // d=3, d+r2=5 == r1 => intersect
        assertEquals("intersect", CirclePosition.getPosition(5, 3, 3, 0)); // overlap
    }
}
