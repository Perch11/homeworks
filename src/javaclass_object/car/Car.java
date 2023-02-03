package javaclass_object.car;

public class Car {

    private String model;
    private String color;
     private int currentSpeed;
     private boolean isEngineStart;

    public Car(String model, String color){  // int currentSpeed, boolean isEngineStart) {
        this.model = model;
        this.color = color;
        //this.currentSpeed = currentSpeed;
       // this.isEngineStart = isEngineStart;
    }

    boolean stopEngine(){
         isEngineStart = false;
                 return isEngineStart;
     }

     boolean startEngine(){
         isEngineStart = true;
            return isEngineStart;
     }
        void info(){

            System.out.print(model + " ");
            System.out.print(color + " ");
            System.out.print(currentSpeed + " ");
            System.out.println(isEngineStart + " ");

        }




    public static void main(String[] args) {

         Car car1 = new Car("c203","black");
         Car car2 = new Car("s505","white");
         car1.startEngine();
         car1.info();
         car2.info();

//        Սահմանել Car class-ը, որը ունի
//●  fields (model, color, currentSpeed (default արժեքը 0), isEngineStart
//                (true or false))
//●  methods (stopEngine() անջատում է մատոռը , startEngine()
//                միացնում է մատոռը)
//        Ստեղծել Mercedes  C203 սեւ   եւ   S505 սպիտակ  մակնիշի
//        մեքենաներ.
    }
}
