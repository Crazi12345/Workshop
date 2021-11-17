package WorkShop.src.main.java;

import java.util.UUID;

public class Actuator {
    UUID ID = UUID.randomUUID();
    String action;
    int setPoint = 0;

    public Actuator(String action){
        this.action = action;
    }

    public UUID getID(){
        return this.ID;
    }

    public int getSetPoint(){
        return this.setPoint;
    }

    public void setSetPoint(int i){
        this.setPoint = i;
    }
}
