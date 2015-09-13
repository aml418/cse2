//Anna Li
//Ask the user to enter the length, width, and heigh of a block 
// and calculate the surface area and volume of the block
//import the scanner 
import java.util.Scanner;
//define a class
public class Block{
    // add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the length of the block:");//prompt the user to enter the length of the block
        double length = myScanner.nextDouble();
        System.out.print("Enter the width of the block:");//prompt the user to enter the width of the block
        double width = myScanner.nextDouble();
        System.out.print("Enter the height of the block:");//prompt the user to enter the height of the block
        double height = myScanner.nextDouble();
        //calculate the surface area and colume 
        double surfaceArea = 2 * (length * width + length *height + width * height);//compute the surface area of the block
        double volume = length * width *height; //compute the volume of the block with the user inputs
        //print the result
        System.out.println("The volume of the block is " + volume);
        System.out.println("The surface area of this block is " + surfaceArea);
    }
    
}