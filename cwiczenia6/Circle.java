public class Circle implements Figure {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String getType(){
        return this.getClass().getSimpleName();
    }

}
