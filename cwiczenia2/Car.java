public class Car {
    String kolor;
    String marka;
    int pojemnoscSilnika;

    public Car(String kolor, String marka, int pojemnoscSilnika){
        this.kolor=kolor;
        this.marka=marka;
        this.pojemnoscSilnika=pojemnoscSilnika;
    }
    public String getKolor(){
        return "Kolor tego samochodu to: " + kolor;
    }
    public String getMarka(){
        return "Marka tego samochodu to: " + marka;
    }
    public void setPojemnoscSilnika (int newpojemnoscSilnika){
        this.pojemnoscSilnika=newpojemnoscSilnika;
    }
    public String getPojemnoscSilnika(){
        return "Pojemność silnika tego samochodu to: " + pojemnoscSilnika;
    }
    public String czywysokoobrotowy(){
        if (pojemnoscSilnika>=2){
            return "Silnik jest wysokoobrotowy.";
        }
        else {
            return "Silnik nie jest wysokoobrotowy.";
        }
        }
    }

