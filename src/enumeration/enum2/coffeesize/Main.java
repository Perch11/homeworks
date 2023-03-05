package enumeration.enum2.coffeesize;

public class Main {

    public static void main(String[] args) {

        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size.name() + " - " + size.ordinal());
        }
    }
}
