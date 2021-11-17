import java.util.ArrayList;
import java.util.UUID;

public class Room {
    private UUID id;

   private ArrayList<Sensor> sensors = new ArrayList<Sensor>();

  private  ArrayList<Actuator> actuators = new ArrayList<Actuator>();

    public Room(UUID id){
    this.id = id;

    }

    public ArrayList<Actuator> getActuators() {
        return actuators;
    }

    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }

    public void remove (Sensor sensor){
        sensors.remove(sensor);
    }

    public void addActuators(Actuator a){
        actuators.add(a);
    }

    public void removeActuators(Actuator a){
        actuators.remove(a);
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }
}
