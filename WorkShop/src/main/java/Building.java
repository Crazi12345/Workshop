package WorkShop.src.main.java;

import java.util.ArrayList;
import java.util.UUID;

public class Building {
    private ArrayList<UUID> rooms = new ArrayList<UUID>();
    private UUID ID = UUID.randomUUID();

    public Building(int amountOfRooms){
        for (int i = 0; i < i; i++) {
            rooms.set(i, UUID.randomUUID());
        }

    }
    public ArrayList<UUID> getRooms(){
        return this.rooms;
    }
    public UUID getID(){
        return this.ID;
    }

}
