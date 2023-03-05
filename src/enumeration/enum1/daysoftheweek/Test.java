package enumeration.enum1.daysoftheweek;

public class Test {
    public static void main(String[] args) {

        DayOfTheWeek monday = DayOfTheWeek.MONDAY;

        System.out.println(monday.getDayNumber());

        System.out.println(DayOfTheWeek.getDayNumber(DayOfTheWeek.SUNDAY));
    }
}
