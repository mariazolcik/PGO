import java.util.ArrayList;
import java.math.BigDecimal;

public class Adder {

    int add(int a, int b){
        return a+b;
    }

    public BigDecimal add(ArrayList<BigDecimal> numbers) {
        BigDecimal wynik = BigDecimal.ZERO;
        for (BigDecimal number : numbers) {
            wynik = wynik.add(number);
        }
        return wynik;
    }

}
