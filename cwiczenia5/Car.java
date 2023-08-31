public class Car extends Vehicle{
    int numberOfSeats;

    public Car(boolean czyWlaczony, int numberOfSeats){
        super(czyWlaczony);
        this.numberOfSeats=numberOfSeats;
    }

    public int getNumberOfSeats(){
        return numberOfSeats;
    }

    @Override
    public boolean start(){return super.start();}

    @Override
    public boolean stop(){return super.stop();}
}
