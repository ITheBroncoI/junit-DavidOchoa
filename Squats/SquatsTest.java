import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquatsTest {

    @Test
    public void testExample1() {
        int n = 4;
        String input = "xxXx";
        String expectedOutput = "1\nXxXx";
        assertEquals(expectedOutput, Squats.solve(n, input));
    }

    @Test
    public void testExample2() {
        int n = 2;
        String input = "XX";
        String expectedOutput = "1\nxX";
        assertEquals(expectedOutput, Squats.solve(n, input));
    }

    @Test
    public void testExample3() {
        int n = 6;
        String input = "xXXxXx";
        String expectedOutput = "0\nxXXxXx";
        assertEquals(expectedOutput, Squats.solve(n, input));
    }
}
