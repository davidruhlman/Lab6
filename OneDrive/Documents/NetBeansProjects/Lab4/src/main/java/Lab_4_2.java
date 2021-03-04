
import java.util.*;


/**
 *
 * @author David Ruhlman
 */
public class Lab_4_2 {
      public static void main(String[] args) {
    System.out.println("Enter the number of checks you have written: ");
    Scanner sc = new Scanner(System.in); 
    String textNumber=sc.next();
    int checkAmount = Integer.parseInt(textNumber);
    double fee = totalCost(checkAmount);
   

  System.out.println("$" + String.format("%,.2f", fee));
  }
      
      
public static double totalCost(int checkAmount){
          double checkingFee;
    if (checkAmount < 20){
       checkingFee = checkAmount * .10 + 10;
    } else if (checkAmount > 20 && checkAmount <= 39 ){
       checkingFee = checkAmount * .08 + 10;
    } else if (checkAmount > 39 && checkAmount <= 59 ){
       checkingFee = checkAmount * .06 + 10;
    } else {
       checkingFee = checkAmount * .04 + 10;
    }
    return checkingFee;
  }
}
