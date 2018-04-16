package Attractions;

import Interfaces.IRestrictable;
import Visitors.Visitor;

public class Playground implements IRestrictable {

    private String name;

    Playground(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() < 15) {
            return false;
        } else {
            return true;
        }
    }


}
