public class LiquidContainer extends Container implements Explosible{
    boolean isDangerous;

    public LiquidContainer(double cargoWeight, int height, int length, int maxWeight, boolean isDangerous) {
        super(cargoWeight, height, length, maxWeight);
        if (isDangerous) this.isDangerous = true;
        else this.isDangerous = false;
    }

    public double loadCargo(double cargoWeight) throws OverfillException {
        if (isDangerous) {
            if (cargoWeight <= maxWeight / 2) {
                return cargoWeight;
            } else {
                explode();
                throw new OverfillException();
            }
        } else {
            if (cargoWeight <= maxWeight * 0.9) {
                return cargoWeight;
            } else {
                explode();
                throw new OverfillException();
            }
        }
    }

    @Override
    public void explode() {
        System.out.println("Liquid container with serial number: " + serialNumber + " exploded!");
    }


}
