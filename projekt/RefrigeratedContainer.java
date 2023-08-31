import java.util.Arrays;
import java.util.List;

public class RefrigeratedContainer extends Container{
    double temp;
    List<String> products;

    {
        products = Arrays.asList("ryba", "mleko", "lody czekoladowe", "ser");
    }

    public RefrigeratedContainer(double cargoWeight, int height, int length, int maxWeight, double temp) {
        super(cargoWeight, height, length, maxWeight);
    }
}
