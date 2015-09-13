//Anna Li
//ask the user to input the time to go to dinner with friends, 
// and calculate the time remains until the dinner 
//
//import scanner for user input
import java.util.Scanner;
//define a class
public class Timer{
    //add a main method
    public static void main(String[] args){;
    //prompt the user to enter the current time
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the current time in HHMM: ");
    int currentTime = input.nextInt();
    //prompt the user to enter the time for dinner
    System.out.print("Enter the time for dinner in HHMM: ");
    int dinnerTime = input.nextInt();
    //calculate the remaining time
    int hour = (dinnerTime - currentTime ) / 100;// the remaining hours
    int min = (dinnerTime - currentTime ) - hour * 100;//the remainig mins
    //show the result
    System.out.println("You have " + hour + " hours and " + min + " minutes until dinner.");
}
}