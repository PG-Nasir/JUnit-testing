import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunitAssert {
    @Test
    public void assertTestCase() {
        //test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //check for not null value
        assertNotNull(temp);
    }
}
