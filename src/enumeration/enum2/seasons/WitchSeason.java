package enumeration.enum2.seasons;

public class WitchSeason {
    /**
     * this method shows which weather the given temperature corresponds to
     * @param temp double type
     */
    public void witchSeason(double temp){

        Seasons season = null;
        for (Seasons s : Seasons.values()) {
            if (s.containsTemperature(temp)) {
                season = s;
                break;
            }
        }
        if (season != null) {
            System.out.print("The temperature corresponds to " + season.name());
        } else {
            System.out.print("Invalid temperature entered.");
        }
    }
}
