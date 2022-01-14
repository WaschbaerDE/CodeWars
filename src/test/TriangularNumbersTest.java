import org.junit.Test;
        import static org.junit.Assert.assertEquals;

public class TriangularNumbersTest {
    @Test
    public void basicTests() {
        assertEquals(56, TriangularNumbers.sumTriangularNumbers(6));
        assertEquals(7140, TriangularNumbers.sumTriangularNumbers(34));
        assertEquals(0, TriangularNumbers.sumTriangularNumbers(-291));
        assertEquals(140205240, TriangularNumbers.sumTriangularNumbers(943));
        assertEquals(0, TriangularNumbers.sumTriangularNumbers(-971));
    }
}

