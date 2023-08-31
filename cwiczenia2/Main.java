public class Main {
    public static void main(String[] args) {

        Telephone telefon1 = new Telephone("Iphone", 100, 656789987);
        Telephone telefon2 = new Telephone("Samsung", 210, 512450450);
        System.out.println(telefon1.wyslijWiadomosc("'Dzień dobry'", telefon2.numer));


        Car samochod1= new Car("czarny", "BMW", 60);
        System.out.println(samochod1.getKolor());
        System.out.println(samochod1.getMarka());
        System.out.println(samochod1.getPojemnoscSilnika());
        samochod1.setPojemnoscSilnika(70);
        System.out.println(samochod1.getPojemnoscSilnika());
        System.out.println(samochod1.czywysokoobrotowy());

    }
}