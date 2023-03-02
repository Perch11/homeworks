package enumeration.distancefromsun;

public enum DistanceFromSun {
    MERCURY(0.39),
    VENUS(0.72),
    EARTH(1.0),
    MARS(1.52),
    JUPITER(5.20),
    SATURN(9.58),
    URANUS(19.18),
    NEPTUNE(30.07);

    private final double distanceFromSun;

    DistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
