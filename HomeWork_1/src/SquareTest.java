import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class SquareTest {
    @Test
    void testAreaSquareSideFifeThenAreaTwentyFife() {
        Square square = new Square(5);
        assertEquals(25, square.getArea());
    }
    @Test
    void testAreaSquareSideOneHundredThenAreaTenThousand() {
        Square square = new Square(100);
        assertEquals(100_000, square.getArea());
    }
    @Test
    void testAreaSquareSideZeroThenAreaZero() {
        Square square = new Square(0);
        assertEquals(0, square.getArea());
    }
    @Test
    void testAreaSquareSideNegativeFourThenException() {
        boolean wasException = false;
        try {
            Square square = new Square(-4);
        }
        catch (Exception e){
            wasException = true;
        }
        assertTrue(wasException);
    }
    @Test
    void testAreaSquareSideNegativeFiveThenException() {
        boolean wasException = false;
        try {
            Square square = new Square(-5);
            System.out.println(square.getArea());
        }
        catch (Exception e){
            wasException = true;
        }
        assertTrue(wasException);
    }
}
