package Attractions;

import Interfaces.IEnjoyable;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IEnjoyable> funThings;
    private ArrayList<IEnjoyable> attractionNames;

    public ThemePark(ArrayList<IEnjoyable> funThings, ArrayList<IEnjoyable> attractionNames){
        this.funThings = funThings;
        this.attractionNames = attractionNames;
    }

    public String reportEnjoyables(){
        String report = "";
        for(IEnjoyable ride : funThings){
            report += ride.getName() + " : " + ride.getFunRating() + ", ";
        }
        return report;
    }

    public String reportAttractionNames(){
        String report = "";
        for(IEnjoyable attraction : attractionNames ){
            report += attraction.getName() + ", ";
        }
        return report;
    }
}
