import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class CircleTest {
    @Test
    void testAreaCircleSideFourThenAreaSixteen() {
        Circle circle = new Circle(4);
        assertEquals(50.265, circle.getArea(), 0.001);
    }
    @Test
    void testAreaCircleRadiusOneHundredThenAreaThirtyOneThousandFourHundredFifteen() {
        Circle circle = new Circle(100);
        assertEquals(31415.926, circle.getArea(), 0.001);
    }
    @Test
    void testAreaCircleSideZeroThenAreaZero() {
        Circle circle = new Circle(0);
        assertEquals(0, circle.getArea());
    }
    @Test
    void testAreaCircleSideNegativeThenException() {
        boolean wasException = false;
        try {
            Circle circle = new Circle(-4);
        }
        catch (Exception e){
            wasException = true;
        }
        assertTrue(wasException);
    }
    @Test
    void testAreaCircleRadiusNegativeTenThenException() {
        boolean wasException = false;
        try {
            Square square = new Square(-10);
            System.out.println(square.getArea());
        }
        catch (Exception e){
            wasException = true;
        }
        assertTrue(wasException);
    }
}
