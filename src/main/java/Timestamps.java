import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        //Computes difference in each unit
        int hourDiff = hours2 - hours1;
        int minutesDiff = minutes2 - minutes1;
        int secondsDiff = seconds2 - seconds1;

        //Converts differences to seconds
        int totalDiff = (hourDiff * 3600) + (minutesDiff * 60) + secondsDiff;

        //Prints result
        System.out.print(totalDiff);
        
        // closing the scanner object
        scanner.close();
    }
}