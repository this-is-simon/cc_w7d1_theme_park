package Stalls;

import Interfaces.IChargeable;
import Visitors.Visitor;

public abstract class Stall implements IChargeable {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int funRating;

    public Stall(String name, String ownerName, int parkingSpot, int funRating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.funRating = funRating;
    }

    public String getName(){
        return this.name;
    }

    public int funRating(){
        return this.funRating;
    }

    public double priceFor(Visitor visitor){
        double wallet = visitor.getMoney();
        return wallet -= 5.00;
    };


}
