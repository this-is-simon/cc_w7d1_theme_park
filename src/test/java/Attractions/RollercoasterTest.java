package Attractions;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before(){
        visitor1 = new Visitor("Jojo", 234, 140, 13);
        visitor2 = new Visitor("Koko", 31, 180, 13);
        rollercoaster = new Rollercoaster();
    }

    @Test
    public void isNotAllowedToRide(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedToRide(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor2));
    }

}