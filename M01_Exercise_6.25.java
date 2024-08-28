import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter milliseconds
        System.out.print("Enter time in milliseconds: ");
        long milliseconds = input.nextLong();

        //convert milliseconds to hours, minutes, and seconds
        String time = convertMillis(milliseconds);

        //result display
        System.out.println("Time is: " + time);

        input.close();
    }

    //conversion to seconds
    public static String convertMillis(long millis) {
        //calculate total seconds
        long totalSeconds = millis / 1000;

        //calculate current seconds
        long seconds = totalSeconds % 60;

        //calculate total minutes
        long totalMinutes = totalSeconds / 60;

        //calculate current minutes
        long minutes = totalMinutes % 60;

        //calculate total hours
        long hours = totalMinutes / 60;

        //make into H:M:S
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}