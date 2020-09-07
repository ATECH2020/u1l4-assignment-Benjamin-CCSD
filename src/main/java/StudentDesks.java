import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();

        //Divides each class by 2, and rounds up
        int seatsA = (int)Math.ceil(classA/2.0);
        int seatsB = (int)Math.ceil(classB/2.0);
        int seatsC = (int)Math.ceil(classC/2.0);

        //Calculates sum of all seats
        int seatSum = seatsA + seatsB + seatsC;
        
        //Prints sum
        System.out.println(seatSum);

        // closing the scanner object
        scanner.close();
    }
}