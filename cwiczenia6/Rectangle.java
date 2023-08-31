public class Rectangle implements Figure{
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimetr() {
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
