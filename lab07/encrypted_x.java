// Anna Li
//lab07 
//e will bury the character in a handful of stars.
//decalre a scanner
import java.util.Scanner;
import java.util.*;//allow me to use hasinput.nextDouble();
//define a class
public class encrypted_x{
    //int userInteger = 0;
    //declare a method
    public static void main(String[] args){
        int userInteger;
        //ask the user for import
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer between 0-100:");
        while (!input.hasNextInt()){
            //userInteger = input.nextInt();
            String junk = input.next();
            System.out.print("Please enter an integer:");
            //System.out.println(userInteger);
        }
        userInteger = input.nextInt();
        while(userInteger < 0 || userInteger > 100){
            System.out.print("Not a positive integer:");
            while(!input.hasNextInt()){
                String junk = input.next();
                System.out.print("Please enter an integer:");
                //System.out.println(userInteger);
        
            }
            userInteger = input.nextInt();
        }
        
        for(int i=0; i < userInteger; i++){
            for(int j=0; j < userInteger; j++){
                if(j == i || j==userInteger-(1 + i)){
                   System.out.print(" ");   
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
            
}
        
        
    
