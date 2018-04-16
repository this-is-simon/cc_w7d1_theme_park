package Stalls;

import Visitors.Visitor;

public class CandyFlossStall extends Stall {

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int funRating){
        super(name, ownerName, parkingSpot, funRating);
    }

    public boolean canBuyTobacco(Visitor visitor){
        if (visitor.getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }

}
