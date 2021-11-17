import java.util.ArrayList;

public class Building {
    ArrayList<Room> rooms = new ArrayList<>();
    int ID = amountOfBuildings;
    public static int amountOfBuildings;

    public Building(int amountOfRooms){
        for (int i = 0; i < i; i++) {
            rooms.set(i, new Room(i));
        }
        amountOfBuildings +=1;
    }
    public ArrayList<Room> getRooms(){
        return this.rooms;
    }
    public int getID(){
        return this.ID;
    }
}
