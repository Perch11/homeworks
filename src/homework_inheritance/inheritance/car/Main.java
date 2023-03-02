package homework_inheritance.inheritance.car;

class Car{
    private int passengerCount;
    private char engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount < 2) {
            throw new IllegalArgumentException("Passenger count must be at least 2.");
        }
        this.passengerCount = passengerCount;
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        if(Character.isLetter(engineType)){
        this.engineType = engineType;
        }
    }

    public Car(int passengerCount, char engineType) {
        if (passengerCount < 2) {
            throw new IllegalArgumentException("Passenger count must be at least 2.");
        }
        this.passengerCount = passengerCount;
        this.engineType = engineType;
    }
}

class Truck extends Car{

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Truck(int passengerCount,char engineType,int capacity){

        super(passengerCount,engineType);
        this.capacity = capacity;

    }
}
public class Main {


    public static void main(String[] args) {
        Truck truck = new Truck(3,'z',14);
        System.out.println(truck.getPassengerCount());
        truck.setPassengerCount(1);
        System.out.println(truck.getPassengerCount());
    }

}
