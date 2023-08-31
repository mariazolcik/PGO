import java.util.ArrayList;

public class Room {
    double powierzchnia;
    ArrayList<Furniture> meble=new ArrayList<>();

    public Room(double powierzchnia, ArrayList<Furniture> meble){
        this.powierzchnia=powierzchnia;
        this.meble=meble;
    }

    public double CenaMebliWPokoju(ArrayList<Furniture> meble){
        double suma= 0;
        for(Furniture m:meble){
            suma +=m.getPriceZVat();
        }
        return suma;
    }
}
