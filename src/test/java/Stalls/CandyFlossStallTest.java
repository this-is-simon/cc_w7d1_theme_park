package Stalls;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall1;

    @Before
    public void before(){
        candyFlossStall1 = new CandyFlossStall("Super Tasty Candy Floss", "Joe", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Super Tasty Candy Floss", candyFlossStall1.getName());
    }

}