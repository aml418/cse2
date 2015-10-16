//Anna Li lab08
//declare a class
//import scanner
import java.util.Scanner;
public class Stats{
    //define a method that calculate the mean
    public static double meanOfFive(double nu1, double nu2, double nu3, double nu4, double nu5){
        double mean = (nu1 + nu2 + nu3 + nu4 + nu5) / 5;
        return mean;
    }
    
    //defien a method that calculates the median
    public static double medianOfFove(double nu1, double nu2, double nu3, double nu4, double nu5){
        return nu3;
    }
    
    //define a void method that can print out result
    public static void printOutResult(double val1, double val2){
       
        System.out.println("The mean for the five numbers is " + val1);
        
        System.out.println("The median for the five numbers is " + val2);
    }
    
    //define the main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first doouble:");//ask 1st for the first time
        double num1 = input.nextDouble();
        System.out.print("Please enter the second doouble:");//ask 2rd for the first time
        double num2 = input.nextDouble();
        while(num2 < num1){//ask for another input for 2rd if not qualified
            System.out.print("Please enter the second doouble, it should be larger than the first double:");
            num2 = input.nextDouble();
        }
        //ask for the 3rd for the first time 
        System.out.print("Please enter the third double:");
        double num3 = input.nextDouble();
        
        while (num3 < num2){//ask for another 3rd if not qualified
            System.out.print("Please enter the third doouble, it should be larger than the second double:");
            num3 = input.nextDouble();
        }
        //ask for the 4th for the first time 
        System.out.print("Please enter the fourth double: ");
        double num4 = input.nextDouble();
        
        while(num4 < num3){//ask for 4th again if not qualified
        System.out.print("Please enter the fourth doouble, it should be larger than third double:");
        num4 = input.nextDouble();
        }
        //ask for 5th for the first time 
        System.out.print("Please enter the fifth double:");
        double num5 = input.nextDouble();
        
        while(num5 < num4){//ask another 5th if not qualified
        System.out.print("Please enter the fifth double, it should be larger than the fourth double:");
        num5 = input.nextDouble();
        }
        
        //calculating by calling methods and printing.
        double value1 = meanOfFive(num1,num2,num3,num4,num5);//call the method define before for mean

        double value2 = medianOfFove(num1, num2, num3, num4, num5);// call the method define before for median
                         
        printOutResult(value1, value2);//call the method define before for printing.
                         
                   
    }//end of main method
}//end of class