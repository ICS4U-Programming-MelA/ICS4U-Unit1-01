/* Asks the user to enter the cut length of logs, and then tells them how many logs of the cut
 * length can fit onto a truck with a load limit of 1100kg.
*/
import java.util.Scanner;

class LoggingCompany {
  public static void main(String[] args) {
    System.out.print("This program determines how many logs can fit onto a truck with a load limit"
                   + " of 1100kg."
                   + " The logs weigh 20kg/m, and they can be cut to 1m, 0.5m, or 0.25m.");
    Scanner input = new Scanner(System.in);
    System.out.print("\n" + "Enter the length cut of the logs (m): "); 
    float userCutLength = input.nextFloat();
    input.close();
    float loadLimit = 1100;
    float logWeight = 20;
    float cutLogWeight = logWeight * userCutLength;
    float truckLogs = loadLimit / cutLogWeight;
    System.out.print("\n" + "The number of " + userCutLength + "m logs the truck can carry is: "
                   + truckLogs);
    System.out.print("\n");
  }
}
