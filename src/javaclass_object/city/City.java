package javaclass_object.city;

public class City {

     private String name;
     private  int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public static void main(String[] args) {


        City yerevan = new City("Yerevan",1075000);
        City mosqow = new City("Mosqow",11980000);
        City newYork = new City("New York",8468000);
        City paris = new City("Paris",15000000);
        System.out.println(yerevan.name + " : " + yerevan.population);
        System.out.println(mosqow.name + " : " + mosqow.population);
        System.out.println(newYork.name + " : " + newYork.population);
        System.out.println(paris.name + " : " + paris.population);
    }
}
