//Anna Li hw08
//import Scanner
import java.util.Scanner;
//define a class
public class Area{
    //call the main method
    
    //method asking to check shape input
    public static double checkInput(double num){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a double as the length/width/base/radius:");
        num = 1.0;
        Boolean bool = true;
        while(bool){
            if(input.hasNextDouble()){
                num = input.nextDouble();
                bool = false;
            }
            else{
                String junk = input.next();
                System.out.print("Please enter valid double:");
                num = input.nextDouble();
            }
        }
        return num;
    }//end for checkInput
    //main method
    public static void main(String[] args){
        //define correct inputs
        //String validInput1 = "rectangle";
        //String validInput2 = "triangle";
        //String validInput3 = "circle";
        Scanner input = new Scanner(System.in);//ask for the shape
        System.out.print("Please type in the shape you want, rectangle, triangle or circle:");
        String userShape = input.next();
        while(!userShape.equals("rectangle")&& !userShape.equals("triangle") && !userShape.equals("circle")){
            System.out.print("Please enter a valid shape(rectangle, triangle or circle):");
            userShape = input.next();
        }
        //check input method
        
        if(userShape.equals("rectangle")){
            //ask for height and width
            //System.out.print("Please enter the height for the rectangle ");
            double heightOfRec = 0; 
            //System.out.print("Please enter the width of the rectangle ");
            double widthOfRec = 0;
            double check1 = checkInput(heightOfRec);
            double check2 = checkInput(widthOfRec);
            double val1 =rectangle(check1, check2);//call the method for rectangle 
            System.out.print("The area for your rectangle is " + val1);
        }
        
        else if(userShape.equals("triangle")){
            //ask for height and base
            //System.out.print("Please enter the height of the triangle:");
            double heightOfTri = 0;
            //System.out.print("Please enter the base of the triangle");
            double baseOfTri = 0;
            double check3 = checkInput(heightOfTri);
            double check4 = checkInput(baseOfTri);
            double val2 = triangle(check3,check4);//call the method for triangle
            System.out.print("The area for your triangle is " + val2);
        }
        
        else{
            //ask for the radius
            //System.out.print("Please enter the radius of the circle:");
            double radius = 0;
            double check5 = checkInput(radius);
            double val3 = circle(check5);//call the method for circle
            System.out.printf("The area for your circle is%10.2f",val3);
        }
    }//end of main method
    
    //method for rectangle
    public static double rectangle(double height, double width){
        double areaOfRectangle = height * width;
        return areaOfRectangle;
    }
    
    //method for triangle
    public static double triangle(double height, double base){
        double areaOfTriangle = height * base * .5;
        return areaOfTriangle;
    }
    
    //method for circle
    public static double circle(double radius){
        double areOfCircle = Math.PI * Math.pow(radius, 2);
        return areOfCircle;
    }
    
}//end of class