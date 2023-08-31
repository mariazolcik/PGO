import java.lang.foreign.SymbolLookup;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Product p1=new Product("ziemniak", 5,898);
        Product p2=new Product("mydło", 10, 123,10);

        p1.setCena(12);
        p1.setLiczbaSztuk(5);

        Category c1=new Category("Spożywka");
        Category c2=new Category("Chemia");

        c1.addProducts(p1);
        c2.addProducts(p2);

        User user1= new User("user1@gmail.com");
        User user2=new User("user2@gmail.com");
        User user3=new User("Maria", "Zolcik", "mzolcik@gmail.com","haslo");

        user1.stworzKonto("Jan","Kowalski", "haslo123");

    }
}