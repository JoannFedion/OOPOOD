import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class RectangleTest {

    @Test
    void testAreaRectangleWeightFourHeightTwoThenAreaEight() {
        Rectangle rect = new Rectangle(4, 2);
        assertEquals(8, rect.getArea());
    }
    @Test
    void testAreaRectangleWeightFiveHeightThreeThenAreaFifteen() {
        Rectangle rect = new Rectangle(5, 3);
        assertEquals(15, rect.getArea());
    }
    @Test
    void testAreaRectangleWeightZeroHeightTwoThenAreaZero() {
        Rectangle rect = new Rectangle(0, 2);
        assertEquals(0, rect.getArea());
    }
    @Test
    void testAreaRectangleWeightZeroHeightZeroThenAreaZero() {
        Rectangle rect = new Rectangle(0, 0);
        assertEquals(0, rect.getArea());
    }
    @Test
    void testAreaRectangleWeightNegativeThenException() {
        boolean wasException = false;
        try {
            Rectangle rect = new Rectangle(-4, 3);
            System.out.println(rect.getArea());
        }
        catch (Exception e){
            wasException = true;
        }
        assertTrue(wasException);
    }
    @Test
    void testAreaRectangleWeightNegativeHeightNegativeThenException() {
        boolean wasException = false;
        try {
            Rectangle rect = new Rectangle(-4, -3);
            System.out.println(rect.getArea());
        }
        catch (Exception e){
            wasException = true;
        }
        assertTrue(wasException);
    }
}