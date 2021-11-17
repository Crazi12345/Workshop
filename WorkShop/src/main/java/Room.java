import java.util.ArrayList;

public class Room {
    int id;
    ArrayList<Sensor> sensors = new ArrayList<>();

    public Room(int id){
        this.id = id;
    }
}
