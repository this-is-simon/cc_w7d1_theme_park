package Stalls;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;
    private Visitor visitor;
    private Visitor visitor2;

    @Before
    public void before(){
        visitor = new Visitor("JoJo", 17, 160, 20 );
        visitor2 = new Visitor("Koko", 21, 150, 30 );
        tobaccoStall = new TobaccoStall("El Smoko", "Smokey McJones", 302, 9);
    }

    @Test
    public void visitorIsNotAllowedToBuyTobacco(){
        assertEquals(false, tobaccoStall.canBuyTobacco(visitor));
    }

    @Test
    public void visitorIsAllowedToBuyTobacco(){
        assertEquals(true, tobaccoStall.canBuyTobacco(visitor2));
    }

    @Test
    public void visitorCanBuyCigs(){
        assertEquals(15, tobaccoStall.priceFor(visitor), 0.01);
    }

}