import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDegrees = scanner.nextInt();

        //Converts hour hand into minutes past the hour
        int minsPast = (hourDegrees*2)%60;
        //Converts mins past the hour to analog degrees
        int minsDegrees = minsPast*6;

        //Prints result
        System.out.print(minsDegrees);

        // closing the scanner object
        scanner.close();
    }
}