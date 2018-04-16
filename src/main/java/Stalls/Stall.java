package Stalls;

import Interfaces.IChargeable;

public abstract class Stall {

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

}
