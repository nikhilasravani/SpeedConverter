import java.util.Scanner;
public class SpeedConverter {

    public static void main(String[] args) {
        Scanner kilo = new Scanner(System.in);
        System.out.println("Enter kilometers per hour = ");
        double kilometers = kilo.nextDouble();

        long miles = toMilesPerHour(kilometers);
        System.out.println("Miles = " +miles);
        printConversion(kilometers);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);


        }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = "+ milesPerHour + " mi/hr");
        }
    }
}
