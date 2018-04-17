package OtherTests;

import Attractions.Rollercoaster;
import Attractions.ThemePark;
import Interfaces.IEnjoyable;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ThemeParkTest {

    private ThemePark themepark1;
    private Rollercoaster rollercoaster1;
    private Rollercoaster rollercoaster2;


    @Before
    public void before(){
        ArrayList<IEnjoyable> ridesAndAttractions = new ArrayList<>();
        ArrayList<IEnjoyable> funThings = new ArrayList<>();
        rollercoaster1 = new Rollercoaster("Death Trap", 9);
        rollercoaster2 = new Rollercoaster("Help Me", 2);
        ridesAndAttractions.add((IEnjoyable) rollercoaster1);
        ridesAndAttractions.add((IEnjoyable) rollercoaster2);
        funThings.add((IEnjoyable) rollercoaster1);
        funThings.add((IEnjoyable) rollercoaster2);
        themepark1 = new ThemePark(ridesAndAttractions, funThings);
    }

    @Test
    public void canGetReportEnjoyables(){
        assertEquals("Death Trap : 9, Help Me : 2, ", themepark1.reportEnjoyables());
    }

    @Test
    public void canGetReportAttractionNames(){
        assertEquals("Death Trap, Help Me, ", themepark1.reportAttractionNames());
    }

}