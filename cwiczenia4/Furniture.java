public class Furniture {
    String nazwa;
    double cena;
    private static final double VAT = 0.23;

    public Furniture(String nazwa, double cena){
        this.nazwa=nazwa;
        this.cena=cena;
    }

    public double getPriceBezVat(){
        return cena;
    }

    public double getPriceZVat(){
        return cena+(cena*VAT);
    }
}
