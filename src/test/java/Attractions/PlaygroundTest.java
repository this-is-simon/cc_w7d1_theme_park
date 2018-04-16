package Attractions;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaygroundTest {

    private Playground playground1;
    private Visitor visitor1;

    @Before
    public void before(){
        playground1 = new Playground("Horrible Playground");
        visitor1 = new Visitor("Jimbob", 14, 140, 10 );

    }

    @Test
    public void visitorIsNotAllowedTo(){
        assertEquals(false, playground1.isAllowedTo(visitor1));
    }

}