import java.util.Random;

public abstract class Container {
    double cargoWeight;
    double height;
    double length;
    int serialNumber;
    {
        Random random = new Random();
        serialNumber = random.nextInt(29464);
    }
    double maxWeight;

    public Container(double cargoWeight, int height, int length, int maxWeight) {
        this.cargoWeight = cargoWeight;
        this.height = height;
        this.length = length;
        this.maxWeight = maxWeight;
        this.serialNumber = serialNumber;
    }

    public void removeCargo() {
        cargoWeight = 0;
    }

    public double loadCargo(double cargoWeight) throws OverfillException {
        if (cargoWeight > maxWeight) {
            throw new OverfillException("Cargo weight exceeds maximum weight");
        }
        this.cargoWeight = cargoWeight;
        return cargoWeight;
    }

}