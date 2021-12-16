
import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class BitsOfIntegerTest {
    @Test
    public void fixed_tests() {
        Assertions.assertEquals(BitsOfInteger.reverse_bits(417), 267);
        Assertions.assertEquals(BitsOfInteger.reverse_bits(267), 417);
        Assertions.assertEquals(BitsOfInteger.reverse_bits(0), 0);
        Assertions.assertEquals(BitsOfInteger.reverse_bits(2017), 1087);
        Assertions.assertEquals(BitsOfInteger.reverse_bits(1023), 1023);
        Assertions.assertEquals(BitsOfInteger.reverse_bits(1024), 1);
    }
}
