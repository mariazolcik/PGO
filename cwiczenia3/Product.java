public class Product {
    String nazwa;
    double cena;
    int kodproduktu;
    int liczbaSztuk=0;

    public Product(String nazwa, double cena, int kodproduktu) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kodproduktu = kodproduktu;
    }

    public Product(String nazwa, double cena, int kodproduktu, int liczbaSztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kodproduktu = kodproduktu;
        liczbaSztuk = liczbaSztuk;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setLiczbaSztuk(int liczbaSztuk) {
        if (liczbaSztuk<0){
            throw new IllegalArgumentException("Nie moze byc mniej niz 0");
        }else {
            liczbaSztuk=liczbaSztuk;
        }
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCena(){
        return cena;
    }
    public int getKodproduktu() {
        return kodproduktu;
    }
    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }
}

