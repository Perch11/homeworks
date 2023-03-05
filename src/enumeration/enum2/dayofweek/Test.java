package enumeration.enum2.dayofweek;

import java.util.Scanner;

public class Test {
    /**
     * this method checks what day of the week is entered
     * @param day enum type - DayOfWeek
     */
    public static void workingDay(DayOfWeek day) {

        if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
            System.out.println(day + " is working day");
        } else {
            System.out.println(day + " is weekend day");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a day of the week: ");
        String input = scanner.nextLine().toUpperCase();
        DayOfWeek day = DayOfWeek.valueOf(input);
        workingDay(day);

    }
}
