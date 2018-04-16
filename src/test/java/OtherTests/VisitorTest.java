package OtherTests;


import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before(){
        visitor1 = new Visitor("Simon", 32, 180, 20 );
        visitor2 = new Visitor("Aileen", 35, 174, 30);

    }

    @Test
    public void hasName(){
        assertEquals("Simon", visitor1.getName());
    }

}
