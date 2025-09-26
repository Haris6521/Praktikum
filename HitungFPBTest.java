import static org.junit.Assert.*;
import org.junit.Test;

public class HitungFPBTest {

    @Test
    public void testFPBBiasa() {
        assertEquals(6, HitungFPB.hitungFPB(12, 18));  // FPB(12,18)=6
        assertEquals(6, HitungFPB.hitungFPB(48, 18));  // FPB(48,18)=6
        assertEquals(1, HitungFPB.hitungFPB(8, 5));    // FPB(8,5)=1
    }

    @Test
    public void testDenganNol() {
        assertEquals(5, HitungFPB.hitungFPB(0, 5));    // FPB(0,5)=5
        assertEquals(7, HitungFPB.hitungFPB(7, 0));    // FPB(7,0)=7
        assertEquals(0, HitungFPB.hitungFPB(0, 0));    // FPB(0,0)=0 (konvensi)
    }

    @Test
    public void testDenganNegatif() {
        assertEquals(4, HitungFPB.hitungFPB(-8, 12));  // FPB(|-8|,12)=4
        assertEquals(3, HitungFPB.hitungFPB(-9, -12)); // FPB(9,12)=3
    }

    @Test
    public void testBilanganPrima() {
        assertEquals(1, HitungFPB.hitungFPB(17, 13));  // FPB bilangan prima berbeda
    }
}
