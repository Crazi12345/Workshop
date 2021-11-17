import java.util.ArrayList;
import java.util.UUID;

public class Building {
    private ArrayList<Room> rooms = new ArrayList<>();
    private UUID ID = UUID.randomUUID();

    public Building(int amountOfRooms){
        for (int i = 0; i < i; i++) {
            rooms.set(i, new Room(i));
        }

    }
    public ArrayList<Room> getRooms(){
        return this.rooms;
    }
    public UUID getID(){
        return this.ID;
    }

}
