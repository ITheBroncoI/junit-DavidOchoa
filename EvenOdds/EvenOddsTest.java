import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvenOddsTest {

    @Test
    public void testExample1() {
        long n = 10;
        long k = 3;
        long expected = 5;
        assertEquals(expected, EvenOdds.findNumberAtPosition(n, k));
    }

    @Test
    public void testExample2() {
        long n = 7;
        long k = 7;
        long expected = 6;
        assertEquals(expected, EvenOdds.findNumberAtPosition(n, k));
    }
}
