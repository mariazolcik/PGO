import java.util.ArrayList;
import java.util.List;

public class ShipContainer {
    List<Container> containers;
    double maxSpeed;
    static int maxContainers;
    static {
        maxContainers = 29464 / 2;
    }
    public ShipContainer(){
        this.containers = new ArrayList<>();
    }

    public static ShipContainer createShipContainer(){
        return new ShipContainer();
    }

    public void addContainer(Container container){
        containers.add(container);
    }

    public void addContainers(List<Container> newContainers){
        containers.addAll(newContainers);
    }

    public void removeContainer(Container container){
        containers.remove(container);
    }

    public void removeContainers(){
        containers.clear();
    }

    public void swapContainer(int position, Container newContainer){
        containers.set(position, newContainer);
    }

    public static void transferContainers(ShipContainer sourceShip, ShipContainer destinationShip){
        destinationShip.addContainers(sourceShip.containers);
        sourceShip.removeContainers();
    }
}
