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
        tobaccoStall = new TobaccoStall("El Smoko", "Smokey McJones", 302);
    }

    @Test
    public void visitorIsNotAllowedTo(){
        assertEquals(false, tobaccoStall.canBuyTobacco(visitor));
    }

    @Test
    public void visitorIsAllowedTo(){
        assertEquals(true, tobaccoStall.canBuyTobacco(visitor2));
    }

}