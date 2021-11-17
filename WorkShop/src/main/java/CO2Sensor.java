import java.util.UUID;

public class CO2Sensor extends Sensor{
    private double c02;
    private UUID id;

    public CO2Sensor(){
        super();
    }
    @Override
    public double getValue(){
        return this.c02;
    }

}
