package enumeration.enum2.solarsystem;

public class Test {
    public static void main(String[] args) {
        for (SolarSystem planet : SolarSystem.values()) {
            System.out.println(planet.getName() + " - " + planet.getMass() + "kg, " + planet.getDistance() + "km from the sun" );
        }

    }
}
