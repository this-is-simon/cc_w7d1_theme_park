package Stalls;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall1;

    @Before
    public void before(){
        iceCreamStall1 = new IceCreamStall("Sweet Ice Cream", "Joe", 10, 7);
    }

    @Test
    public void hasName(){
        assertEquals("Sweet Ice Cream", iceCreamStall1.getName());
    }

}