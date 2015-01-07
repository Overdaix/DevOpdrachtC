import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testPasses() {
        // expected outcome
        int expected = 2;
        int output = Main.calc(1,1);
        //check if output equals expected.
        assertEquals(output, expected);
    }

}

