package Stalls;

import Visitors.Visitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall1;
    private Visitor visitor;

    @Before
    public void before(){
        iceCreamStall1 = new IceCreamStall("Sweet Ice Cream", "Joe", 10, 7);
        visitor = new Visitor("JoJo", 17, 160, 20 );
    }


    @Test
    public void hasName(){
        assertEquals("Sweet Ice Cream", iceCreamStall1.getName());
    }

    @Test
    public void visitorCanBuyIceCream(){
        assertEquals(15, iceCreamStall1.priceFor(visitor), 0.01);
    }
}