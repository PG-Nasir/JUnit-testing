import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    @Test

    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }

    @Test
    public void testAdd2() {
        String str = "Junit 2 is working fine";
        assertEquals("Junit is working fine",str);
    }
}
