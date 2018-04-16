package Stalls;

import Visitors.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public boolean canBuyTobacco(Visitor visitor){
        if (visitor.getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }

}
