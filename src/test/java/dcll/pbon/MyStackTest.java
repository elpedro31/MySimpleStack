package dcll.pbon;

import junit.framework.TestCase;

/**
 * Created by 21103619 on 04/03/2015.
 */
public class MyStackTest extends TestCase {

public void testEmpty(){
    MySimpleStack s = new MySimpleStack();
    assertTrue(s.isEmpty());
}

public void testNEmpty(){
        MySimpleStack s = new MySimpleStack();
        s.push(new Item());
        assertFalse(s.isEmpty());
}

public void testgetSize(){
    MySimpleStack s = new MySimpleStack();
    s.push(new Item());
    assertEquals(s.getSize(), 1);
}

public void testPush(){
    MySimpleStack s = new MySimpleStack();
    int before = s.getSize();
    s.push(new Item());
    assertEquals(before, s.getSize() - 1);
}

public void testPop(){
    MySimpleStack s = new MySimpleStack();
    s.push(new Item());
    int before = s.getSize();

    assertTrue(s.pop() instanceof Item);

    assertEquals(s.getSize(), before - 1);

}



public void testPeek(){
    MySimpleStack s = new MySimpleStack();
    s.push(new Item());
    int before = s.getSize();

    assertTrue(s.peek() instanceof Item);

    assertEquals(s.getSize(), before);
}
}
