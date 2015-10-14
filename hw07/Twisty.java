//anna Li
//declare a class
// a group in this program refers to a repeatable pattern that can create the whole printing.
//import scanner
import java.util.Scanner;
import java.util.*;
public class Twisty{
    //declare a main method 
    public static void main (String[] args){
        //ask the user for the length
        Scanner input = new Scanner(System.in);
        int length = 0;
        Boolean bool1 = true; // A variable thay you will make false if the input is correct.
        System.out.print("Please enter the length you want:");
        while(bool1){//keep looping(bool = true) untill input is correct
            if(input.hasNextInt()){
                 length = input.nextInt();
                if(length > 0 || length < 80){
                   bool1 = false;// you satisfied both requirements for a correct input
                }
                else{
                System.out.print("Please enter a postive integer less than 80");
                }
            }
            else{
            System.out.print("Wrong input.");
            String junk = input.next();
            }
        }
        //ask for the width 
        int width = 0;
        Boolean bool2 = true;
        System.out.print("Please enter the width you want:");
        while(bool2){
            if(input.hasNextInt()){
                  width = input.nextInt();
                if(width < length){
                    bool2 = false;
                }
                else{
                  System.out.print("Please enter a width smaller than length:");
                }
            }
            else{
                System.out.print("Wrong input.");
                String junk = input.next();
                }
        }
        
        
        //print the pattern
        //int counter = 0; //length % width;
        int m = length % width;
        for(int i = 1; i <= width; i++){
            for(int j = 1; j <= length; j++){
                int n = 0;
                while(n <= m){
                    if (j == i + 2 * n * width ){
                        System.out.print("#");
                    }
                    else if (j == 2 * width - i + 1 + ( 2 * n * width)){
                        System.out.print("#");
                    }
                    else if(j == (width - i + 1) + 2 * n * width){
                        System.out.print("/");
                    }
                    else if(j == width + i + 2 * n * width){
                        System.out.print("\\");
                    }
                    else{
                        System.out.print(" ");
                    }                    
                    n++;
                }
                  
                }//end for inner for
                
            System.out.println();
        }//end of for
       
    }//end of method
}//end of class