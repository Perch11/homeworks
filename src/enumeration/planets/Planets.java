package enumeration.planets;

public enum Planets {
    MERCURY("Mercury",88),
    VENUS("Venus",225),
    EARTH("Earth",365),
    MARS("Mars", 687),
    JUPITER("Jupiter",4333),
    SATURN("Saturn",10759),
    URANUS("Uranus",30687),
    NEPTUNE("Neptune",60200);

    private final String name;
    private final int yearLength;

    /**
     * constructor
     * @param name string type
     * @param yearLength int type
     */
    private Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    /**
     * getter
     * @return string name
     */
    public String getName() {
        return name;
    }

    /**
     * lowercase getter
     * @return string name
     */
    public String getNameLowercase() {
        return name.toLowerCase();
    }

    /**
     * getter yearLength
     * @return int type
     */
    public int getYearLength() {
        return yearLength;
    }
}
