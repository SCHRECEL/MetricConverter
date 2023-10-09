import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ready = false;
        double meters = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        do {


            System.out.println("Enter the meters to convert: ");
                meters = scanner.nextDouble();
                if (meters > 0.0) {
                   ready = true;
                }
                else System.out.println("Enter a valid input.");
        }while (!ready);

        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.37;

        System.out.println(meters + " Meters is "+miles+" Miles, "+feet+" Feet and "+inches+ " Inches.");

    }
}