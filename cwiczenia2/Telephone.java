public class Telephone {
    String marka;
    double roz;
    int numer;

    public Telephone(String marka, double roz, int numer){
        this.marka=marka;
        this.roz=roz;
        this.numer=numer;
    }
    String wyslijWiadomosc(String sms, int numer){
        return "Wysyłam wiadomość " + sms + " na numer " + numer;
    }
    @Override
    public String toString(){
        return "Telephone{" +
                "marka='" + marka + '\''+
                ", roz=" + roz +
                ", numer=" + numer +
                '}';
    }
}
