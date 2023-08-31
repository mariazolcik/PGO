public class GasContainer extends Container implements Explosible{
    double pressure;

    public GasContainer(double cargoWeight, int height, int length, int maxWeight, double pressure) {
        super(cargoWeight, height, length, maxWeight);
    }

    public double loadCargo(double cargoWeight) throws OverfillException {
        if(cargoWeight > maxWeight){
            explode();
            throw new OverfillException("Gas container with serial number: " + serialNumber + " overfilled!");
        }
        return cargoWeight;
    }

    public double removeCargo(double cargoWeight){
        cargoWeight = cargoWeight * 0.05;
        return cargoWeight;
    }

    @Override
    public void explode(){
        System.out.println("Gas container with serial number: " + serialNumber + " exploded!");
    }


}
