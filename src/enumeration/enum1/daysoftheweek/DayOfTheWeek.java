package enumeration.enum1.daysoftheweek;

public enum DayOfTheWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int dayNumber;

    /**
     * constructor
     * @param dayNumber int type
     */
    DayOfTheWeek(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    /**
     * getter dayNumber
     * @return int type
     */
    public int getDayNumber() {
        return dayNumber;
    }

    /**
     * this static method get us dey number in enum
     * @param day type of enum
     * @return int type
     */
    public static int getDayNumber(DayOfTheWeek day) {
        return day.getDayNumber();
    }
}
