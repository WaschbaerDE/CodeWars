import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FriendsTest {
    @Test
    public void shouldWorkForExampleTestCases() {
        assertEquals(0, Friends.friends(0));
        assertEquals(0, Friends.friends(1));
        assertEquals(0, Friends.friends(2));
        assertEquals(1, Friends.friends(4));

    }
}
