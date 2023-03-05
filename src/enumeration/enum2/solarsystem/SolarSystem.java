package enumeration.enum2.solarsystem;

public enum SolarSystem {

    MERCURY("Mercury", 3.285E23, 57.91E6),
    VENUS("Venus", 4.867E24, 108.2E6),
    EARTH("Earth", 5.972E24, 149.6E6),
    MARS("Mars", 6.39E23, 227.9E6),
    JUPITER("Jupiter", 1.898E27, 778.5E6),
    SATURN("Saturn", 5.683E26, 1.43E9),
    URANUS("Uranus", 8.681E25, 2.87E9),
    NEPTUNE("Neptune", 1.024E26, 4.5E9);

    private final String name;
    private final double mass;
    private final double distance;

    /**
     * enam constructor
     *
     * @param name     string type
     * @param mass     double type - in kilograms
     * @param distance double type - in kilometers
     */
    SolarSystem(String name, double mass, double distance) {
        this.name = name;
        this.mass = mass;
        this.distance = distance;
    }

    /**
     * getter
     *
     * @return string type - name
     */
    public String getName() {
        return name;
    }

    /**
     * getter
     *
     * @return double type - massive
     */
    public double getMass() {
        return mass;
    }

    /**
     * getter
     *
     * @return double type - distance
     */
    public double getDistance() {
        return distance;
    }
}
