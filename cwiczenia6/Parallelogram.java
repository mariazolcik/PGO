public class Parallelogram implements Figure{
    double base;
    double height;
    double sideLenght;

    public Parallelogram(double base, double height, double sideLenght){
        this.base = base;
        this.height = height;
        this.sideLenght = sideLenght;
    }
    @Override
    public double getPerimetr() {
        return 2*(base + sideLenght);
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
