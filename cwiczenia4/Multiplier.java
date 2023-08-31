import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {

    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int a, int b, int c, int d){
        return multiply(a,b)*c*d;
    }

    double multiply(double a, double b){
        return a*b;
    }

    BigDecimal multiply(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

    int multiply(ArrayList<Integer> liczby){
        int wynik=1;
        for(int i=0;i<liczby.size();i++){
            wynik *= liczby.get(i);
        }
        return wynik;
    }
}
