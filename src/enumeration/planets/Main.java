package enumeration.planets;

public class Main {

    public static void main(String[] args) {

        Planets planet = Planets.JUPITER;

        System.out.println(planet.getName());

        System.out.println(planet.getNameLowercase());

        System.out.println(planet.getYearLength());
    }
}
