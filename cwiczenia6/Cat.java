public class Cat extends Animal implements Moveable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "cat";
    }

    @Override
    public void start() {
        System.out.println(name + " starts!");
    }

    @Override
    public void stop() {
        System.out.println(name + " stopped!");

    }
}
