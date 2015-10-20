//Anna Li hw08 program #2
//import the Scanner
import java.util.Scanner;
//define the class
public class StringAnalysis{
    //call the main class
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string:");
        String userInputString = input.next();
    }//end of main method
    
    //method that just receive string
    public static chr stringCheck(String string){
        if (string >= 'a' && string <= 'z'){
            return string;
        }
        
        
    }
}//end of class