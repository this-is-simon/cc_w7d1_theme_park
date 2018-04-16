package Attractions;

import Interfaces.IRestrictable;
import Visitors.Visitor;

public class Rollercoaster implements IRestrictable {

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } else {
            return false;
        }
    }
}
