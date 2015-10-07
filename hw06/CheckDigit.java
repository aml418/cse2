//Anna Li Homework 6, CheckDigit.java
//import scanner, so user can input number 
import java.util.Scanner;
//define a class
public class CheckDigit{
    //declare the main mthod
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int barcode = -10;//initial barcode in the main method 
    int firstDigit;
    int secondDigit;
    int thirdDigit;
    int fourthDigit;
    int fifthDigit;
    int sixthDigit;
    int seventhDigit;
    int eighthDigit;
    int ninthDigit;
    int sum;
    int tenthDigit;
    //System.out.print("Please enter a 10-digit barcode:");
    while (!input.hasNextInt()){
           System.out.print("Please enter a 10-digit barcode:");
           //barcode = input.nextInt();
    } 
   
       //When the enter digits is valid 10 digits, excute the following command: 
            firstDigit = barcode / 1000000000;
            //System.out.println(firstDigit);
            secondDigit = ( barcode % 1000000000 ) / 100000000;
            //System.out.println(secondDigit);
            thirdDigit = (barcode - firstDigit * 1000000000 - secondDigit * 100000000) / 10000000;
            //System.out.println(thirdDigit);
            fourthDigit =(barcode - firstDigit * 1000000000 - secondDigit * 100000000 - thirdDigit * 10000000) / 1000000;
            //System.out.println(fourthDigit);
            fifthDigit = (barcode - firstDigit * 1000000000 - secondDigit * 100000000 - thirdDigit * 10000000 - fourthDigit * 1000000) / 100000;
            //System.out.println(fifthDigit);
            sixthDigit = (barcode - firstDigit * 1000000000 - secondDigit * 100000000 - thirdDigit * 10000000 - fourthDigit * 1000000 - fifthDigit * 100000) / 10000;            
            //System.out.println(sixthDigit);
            seventhDigit=(barcode - firstDigit * 1000000000 - secondDigit * 100000000 - thirdDigit * 10000000 - fourthDigit * 1000000 - fifthDigit * 100000 - sixthDigit * 10000) / 1000;
            //System.out.println(seventhDigit);
            eighthDigit =(barcode - firstDigit * 1000000000 - secondDigit * 100000000 - thirdDigit * 10000000 - fourthDigit * 1000000 - fifthDigit * 100000 -sixthDigit * 10000 -seventhDigit * 1000) / 100; 
            //System.out.println(eighthDigit);
            ninthDigit = (barcode - firstDigit * 1000000000 - secondDigit * 100000000 - thirdDigit * 10000000 - fourthDigit * 1000000 - fifthDigit * 100000 - sixthDigit * 10000 - seventhDigit * 1000 - eighthDigit * 100) / 10;
            //System.out.println(ninthDigit);
            //calculate sum
            sum = (firstDigit * 10 + secondDigit * 9 + thirdDigit * 8 + fourthDigit * 7 + fifthDigit * 6 + sixthDigit * 5 + seventhDigit * 4 + eighthDigit * 3 + ninthDigit * 2 ) % 11;
            tenthDigit = barcode - firstDigit * 1000000000 - secondDigit * 100000000 - thirdDigit * 10000000 - fourthDigit * 1000000 - fifthDigit * 100000 - sixthDigit * 10000 - seventhDigit * 1000 - eighthDigit * 100 - ninthDigit * 10;
            //System.out.println(sum);
            //System.out.println(tenthDigit);
            if (sum == tenthDigit){
                System.out.println("This barcode is valid.");
            }//end of if
            else{
                if(tenthDigit == 0){
                    System.out.println("This barcode is NOT valid. The check digit should be X");
                }
                else{
                    System.out.println("This barcode is NOT valid. The check digit should be " + tenthDigit);
                }//end of nested else
             }//end of else 

}
}