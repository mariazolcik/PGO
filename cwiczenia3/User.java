public class User {
    String imie;
    String nazwisko;
    String email;
    String haslo;
    boolean czyKontoGoscia;

    public User(String imie, String nazwisko, String email, String haslo){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.email=email;
        this.haslo=haslo;
        this.czyKontoGoscia=false;
    }
    public User(String email){
        this.email=email;
        this.czyKontoGoscia=true;
    }
    public boolean czyKontoGoscia(){
        return czyKontoGoscia;
    }
    public void stworzKonto(String imie, String nazwisko, String haslo){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.haslo=haslo;
        this.czyKontoGoscia=false;
    }
}
