import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class StantonTest {
    @Test
    public void sampleTests() {
        assertEquals(3, Stanton.stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));
    }
}