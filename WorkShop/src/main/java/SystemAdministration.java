import java.util.ArrayList;
public class SystemAdministration {

    ArrayList<Building> buildings = new ArrayList<Building>();

    public ArrayList<Building> getBuildings(){
        return buildings;
    }

    public void addBuilding(Building building){
        buildings.add(building);
    }

    public void removeBuilding(Building building){
        for(int i = 0; i < buildings.size(); i++){
            if(buildings.get(i)==building){
                buildings.remove(i);
            }
        }
    }

    public void printBuildings(){
        for(int i = 0; i < buildings.size(); i++){
            System.out.print(buildings.get(i).getID());
        }
    }

}
