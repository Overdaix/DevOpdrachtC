import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testPasses() {
        // expected outcome
        int expected = 3;
        int output = Main.calc(1,2);
        //check if output equals expected.
        assertEquals(output, expected);
    }

}

