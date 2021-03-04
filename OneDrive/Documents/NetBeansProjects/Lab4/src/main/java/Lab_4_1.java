
import java.util.Scanner;
/**
 *
 * @author David Ruhlman
 */
public class Lab_4_1 {
    public static void main(String[] args) {
            int Age;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your age? ");
    String yourAge = keyboard.nextLine();
    Age = Integer.parseInt(yourAge);
     int totalCost = costCalc(Age);
    System.out.println("Your life insurace cost is: " + totalCost);
    }

    public static int costCalc(int Age){
    int cost;
     cost = (5 * Age + 300 );
    return cost;
    }
}
