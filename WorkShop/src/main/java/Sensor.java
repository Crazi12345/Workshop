package WorkShop.src.main.java;

import java.util.UUID;

public abstract class Sensor {
    private UUID id;

    public Sensor(){
        this.id = UUID.randomUUID();
    }
    public String getType(){
        return this.getClass().toString();
    }

    public double getValue(){
        return 0;
    }

    public UUID getId(){
        return this.id;
    }
}
