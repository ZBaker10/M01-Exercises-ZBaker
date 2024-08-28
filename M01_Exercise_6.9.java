import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //choose a conversion
        System.out.println("Choose a conversion:");
        System.out.println("1: Feet to Meters");
        System.out.println("2: Meters to Feet");
        int choice = input.nextInt();

        //make conversion based on user choice
        if (choice == 1) {
            System.out.print("Enter the number of feet: ");
            double feet = input.nextDouble();
            double meters = footToMeter(feet);
            System.out.println(feet + " feet is " + meters + " meters");
        } else if (choice == 2) {
            System.out.print("Enter the number of meters: ");
            double meters = input.nextDouble();
            double feet = meterToFoot(meters);
            System.out.println(meters + " meters is " + feet + " feet");
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        input.close();
    }

    //feet to meters
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    //meters to feet
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}