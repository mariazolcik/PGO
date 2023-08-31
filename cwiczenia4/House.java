import java.util.ArrayList;

public class House {
    private static int liczbaPokoi;
    ArrayList<Room> pokoje=new ArrayList<>();

    public House(ArrayList<Room> pokoje){
        this.pokoje=pokoje;
    }

    public void addRoom(Room room) {
        this.pokoje.add(room);
        liczbaPokoi++;
    }

    public void addRooms(ArrayList<Room> pokoje) {
        this.pokoje.addAll(pokoje);
        liczbaPokoi += pokoje.size();
    }

    public int getLiczbaPokoi(){
        return liczbaPokoi;
    }
}
