import java.util.UUID;

public class TemperatureSensor extends Sensor {
    private double temp;
    private UUID id;

    public TemperatureSensor() {
        super();
    }

    @Override
    public double getValue() {
        return this.temp;
    }
}