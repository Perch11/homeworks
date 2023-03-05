package enumeration.enum1.distancefromsun;

public class Main {
    public static void main(String[] args) {
//
//        double distanceFromSun = DistanceFromSun.SATURN.getDistanceFromSun();
//
//        System.out.println("Distance from sun: " + distanceFromSun + " AU");

        for (DistanceFromSun planet : DistanceFromSun.values()) {
            System.out.println(planet.name() + " is " + planet.getDistanceFromSun() + " AU from the sun.");
        }

    }
}
