public class Car implements Comparable<Car>{
    int productionYear;
    String name;

    public Car(int productionYear, String name){
        this.productionYear = productionYear;
        this.name = name;
    }

    public int getProductionYear(){
        return productionYear;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Car o){
        if (productionYear == o.getProductionYear()){
            return 0;
        }else if(productionYear > o.getProductionYear()){
            return  1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString(){
        return "Car{" +
                "productionYear=" + productionYear +
                " , name='" + name + '\'' +
                '}';
    }
}
