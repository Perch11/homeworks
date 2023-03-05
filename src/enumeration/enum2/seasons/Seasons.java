package enumeration.enum2.seasons;

public enum Seasons {
    SPRING(5,22),
    SUMMER(19,45),
    AUTUMN(9,18),
    WINTER(-40,8);



    public double minTemp;
    private  double maxTemp;

    /**
     * constructor
     * @param minTemp - type double
     * @param maxTemp - type double
     */
    Seasons(double minTemp,double maxTemp){
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    /**
     * getter
     * @return minimum temperature - type double
     */
    public double getMinTemp() {
        return minTemp;
    }

    /**
     * setter
     * @param minTemp - type double
     */
    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    /**
     * getter
     * @return maximum temperature - type double
     */
    public double getMaxTemp() {
        return maxTemp;
    }

    /**
     * setter
     * @param maxTemp - type double
     */
    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    /**
     * this method shows whether a given temperature is within the given weather temperature range
     * @param temperature - type double
     * @return type boolean
     */
    public boolean containsTemperature(double temperature) {
        return temperature >= minTemp && temperature <= maxTemp;
    }
}
