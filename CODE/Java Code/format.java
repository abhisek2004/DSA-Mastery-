import java.util.Scanner;

class format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in 12-hour format (hh:mm:ssAM/PM): ");
        String s = scanner.nextLine();
        System.out.println("Time in 24-hour format: " + timeConversion(s));
    }

    public static String timeConversion(String s) {
        String[] parts = s.split(":");
        String hours = parts[0];
        String minutes = parts[1];
        String seconds = parts[2].substring(0, 2);
        String amPm = parts[2].substring(2);

        int hour = Integer.parseInt(hours);
        if (amPm.equals("PM") && hour != 12) {
            hour += 12;
        } else if (amPm.equals("AM") && hour == 12) {
            hour = 0;
        }

        return String.format("%02d:%s:%s", hour, minutes, seconds);
    }
}