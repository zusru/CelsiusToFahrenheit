import java.util.Scanner;
public class C_to_F {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Celsius Degree: ");

        float C = input.nextInt();
        float F = 9f/5 * C + 32;

        System.out.println("Celsius Degree " + C + " = " + F + " in Fahrenheit!");
    }
}
