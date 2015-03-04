package dcll.pbon;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MySimpleStackTest extends TestCase {
    SimpleStack s;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        s = new MySimpleStack();

    }
    @Test
    public void testIsEmpty() throws Exception {

        assertTrue(s.isEmpty());
    }
    @Test
    public void testGetSize() throws Exception {
        s.push(new Item());
        assertEquals(s.getSize(), 1);

    }
    @Test
    public void testPush() throws Exception {
        int before = s.getSize();
        s.push(new Item());
        assertEquals(before, s.getSize() - 1);
    }
    @Test
    public void testPeek() throws Exception {
        s.push(new Item());
        int before = s.getSize();

        assertTrue(s.peek() instanceof Item);

        assertEquals(s.getSize(), before);
    }
    @Test
    public void testPop() throws Exception {
        s.push(new Item());
        int before = s.getSize();

        assertTrue(s.pop() instanceof Item);

        assertEquals(s.getSize(), before - 1);
    }
}
