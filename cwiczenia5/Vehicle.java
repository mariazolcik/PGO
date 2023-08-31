public class Vehicle {
    boolean czyWlaczony;

    public Vehicle(boolean czyWlaczony){
        this.czyWlaczony=czyWlaczony;
    }

    public boolean start(){
        return czyWlaczony=true;
    }

    public boolean stop(){
        return czyWlaczony=false;
    }

}
