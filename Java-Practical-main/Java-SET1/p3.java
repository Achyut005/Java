import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        double distanceMeters = scanner.nextDouble();

        System.out.print("Enter the hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter the minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter the seconds: ");
        int seconds = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        double speedMps = distanceMeters / totalSeconds;
        double speedKph = (distanceMeters / 1000) / (totalSeconds / 3600);
        double speedMph = (distanceMeters / 1609) / (totalSeconds / 3600);

        System.out.printf("Speed in meters per second: %.2f m/s%n", speedMps);
        System.out.printf("Speed in kilometers per hour: %.2f km/h%n", speedKph);
        System.out.printf("Speed in miles per hour: %.2f mph%n", speedMph);
        scanner.close();
    }
}