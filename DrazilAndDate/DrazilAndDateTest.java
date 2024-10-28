import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DrazilAndDateTest {

    @Test
    public void testExample1() {
        // Prueba con la entrada 5, 5, 11
        assertEquals("No", DrazilAndDate.isPossible(5, 5, 11));
    }

    @Test
    public void testExample2() {
        // Prueba con la entrada 10, 15, 25
        assertEquals("Yes", DrazilAndDate.isPossible(10, 15, 25));
    }
    
    @Test
    public void testExample3() {
        // Prueba con la entrada 0, 5, 1
        assertEquals("No", DrazilAndDate.isPossible(0, 5, 1));
    }

}

