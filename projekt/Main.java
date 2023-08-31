public class Main {
    public static void main(String[] args) {
        ShipContainer ship1 = ShipContainer.createShipContainer();
        ShipContainer ship2 = ShipContainer.createShipContainer();

        RefrigeratedContainer refrigeratedContainer = new RefrigeratedContainer(900, 200, 1000, 10000, -10);
        LiquidContainer liquidContainer = new LiquidContainer(500, 200, 1000, 10000, false);
        GasContainer gasContainer = new GasContainer(50, 200, 1000, 10000, 40);

        ship1.addContainer(refrigeratedContainer);
        ship1.addContainer(liquidContainer);
        ship1.addContainer(gasContainer);

        ShipContainer.transferContainers(ship1, ship2);

        ship2.removeContainers();

    }
}