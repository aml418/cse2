//Anna Li
//The user has gone out to dinner with friends. After they receive the bill, they decide to split the check evenly. 
//We need the following infomation in order to calculate
//the original cost of the check
//the percentage tip they wish to pay
//the number of ways the check will be split
//how much each person in the group needs to spend in order to pay the check.

//import the scanner
import java.util.Scanner;
//define a class
public class Check{
    //add main method
    public static void main (String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the original cost of the check in the form xx.xx: ");//prompt the user for the original cost of the check
        double checkCost = myScanner.nextDouble();
        //prompt the user for the tip percentage that they wish to pay and accept the input.
        System.out.print("Enter the percentage tip that you wish to pay as a whole number:");
        double tipPercent = myScanner.nextDouble();
        //prompt the user for the number of people that went of to dinner and accept the input.
        System.out.print("Enter the number of people who went out to dinner:");
        int numPeople = myScanner.nextInt();
        //Print out the output. 
        double totalCost =  checkCost * (1 + tipPercent/100); //We want to convert the percentage into a decimal value
        double costPerPerson = totalCost / numPeople;
        int dollars = (int)costPerPerson; //whole dollar amount of cost 
        int dimes=(int)(costPerPerson * 10) % 10;
        int pennies=(int)(costPerPerson * 100) % 10;
        //System.out.println("Each person in the group owes $” + (int)dollars + "." + ((int)dimes +(int) pennies));
        System.out.println("Each person in the group owes $" + (int)dollars + "." + ((int)dimes + (int)pennies));

}
        
}//end of the class