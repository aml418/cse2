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
        System.out.print("Do you want to exam all the characters, for 1, or a certain number, for 2 ?");
        int userChoose = input.nextInt();
        while (userChoose != 1 && userChoose != 2){
            System.out.print("Please enter 1 for examing all the characters and 2 for a certain number:");
            userChoose = input.nextInt();
        }//check if the input is valid
        
        if(userChoose == 1){
            Boolean val2 = stringCheck(userInputString);//call the method
            System.out.print(val2);
        }
        else{
            System.out.print("How many characters would like to check?");
            int userWant = input.nextInt();
            Boolean val1 = stringCheck(userInputString,userWant);//call the method
            System.out.print(val1);
        }
    }//end of main method
    
    //method that just receive only string
    public static Boolean stringCheck(String userString){
        for(int i = 1; i <= userString.length(); i++){
            if(Character.isLetter(userString.charAt(i))){
                return true;
            }
            else{
                return false;
            }
        }//end of while
    return true;
    }//end of method
    
    public static Boolean stringCheck(String userString, int x){
        
        if(x > userString.length()){
            for(int j =1; j <= userString.length(); j++){
            if(Character.isLetter(userString.charAt(j))){
                return true;
            }
            else{
                return false;
            }
            }//end of for
        }//end for if
        else{
            for(int i = 1; i <= x; i++){
            if(Character.isLetter(userString.charAt(i))){
                return true;
            }
            else{
                return false;
            }
            }//end of for
        }//end for else
    return true;
    }//end for method
        
    
}//end of class