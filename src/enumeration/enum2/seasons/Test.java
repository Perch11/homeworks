package enumeration.enum2.seasons;

import java.util.Scanner;

public class Test extends WitchSeason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature: ");

        double temperature = scanner.nextDouble();

        WitchSeason witchSeason = new WitchSeason();

        witchSeason.witchSeason(temperature);

    }
}
