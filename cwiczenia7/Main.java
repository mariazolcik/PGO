import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car(2020, "Porsche 911"));
        cars.add(new Car(2022, "Mercedes-Benz G-Class"));
        cars.add(new Car(2010, "Fiat 500"));
        cars.add(new Car(1961, "Jaguar E-Type"));
        cars.add(new Car(1964, "Ford GT40"));
        cars.add(new Car(1962, "Ferrari 250 GTO"));
        cars.add(new Car(1992, "Ferrari F40"));
        cars.add(new Car(2023, "BMW M8"));
        cars.add(new Car(2004, "Cadillac Escalade"));
        cars.add(new Car(2018, "Lamborghini Aventador"));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.getName() + " " + car.getProductionYear());
        }


        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "item1"));
        itemList.add(new Item(2, "item2"));
        itemList.add(new Item(3, "item3"));
        itemList.add(new Item(4, "item4"));
        itemList.add(new Item(5, "item5"));

        for (Item item : itemList) {
            item.show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();

        for (Item item : itemList) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        itemList.add(new Item(6, "item6"));
        itemList.add(new Item(7, "item7"));
        itemList.add(new Item(8, "item8"));
        itemList.add(new Item(9, "item9"));
        itemList.add(new Item(10, "item10"));
        itemList.add(new Item(11, "item11"));
        itemList.add(new Item(12, "item12"));
        itemList.add(new Item(13, "item13"));
        itemList.add(new Item(14, "item14"));
        itemList.add(new Item(15, "item15"));

        List<Item> sublist = itemList.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>();
        itemSet.addAll(sublist);
        System.out.println(itemSet);


        int[] arr = new int[10];
        try {
            fillArray(arr);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return num;
    }

    public static void fillArray(int[] arr) throws NegativeNumberException {
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = readNumber();
            } catch (NegativeNumberException e) {
                arr[i] = 0;
                System.out.println(e.getMessage());
            }
        }

    }
}