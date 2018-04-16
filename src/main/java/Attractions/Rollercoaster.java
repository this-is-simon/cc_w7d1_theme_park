package Attractions;

import Interfaces.IEnjoyable;
import Interfaces.IRestrictable;
import Visitors.Visitor;

public class Rollercoaster extends Attraction implements IRestrictable, IEnjoyable {

    public Rollercoaster(String name, int funRating){
        super(name, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } else {
            return false;
        }
    }

}


//package Stalls;
//
//public class IceCreamStall extends Stall {
//
//    public IceCreamStall(String name, String ownerName, int parkingSpot, int funRating){
//        super(name, ownerName, parkingSpot, funRating);
//    }
//}