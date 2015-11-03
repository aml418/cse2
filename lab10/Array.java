//Anna Li lab 10
import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        String[] students;//declare an array
        int val = (int)((Math.random() * 5) + 5);
        students = new String[val];//allocate meory for the 5 names
        
        int[] midterm;//create the second array
        midterm = new int[val];//allocate memory for 5 int
        System.out.print("Please enter " + val + " student name:");//ask for input
        for (int i = 0; i < val; i++){
            Scanner input = new Scanner(System.in);
            students[i] = input.next();//initialize the first name
            midterm[i] = (int)(Math.random() * 100);
       }//end of for
       System.out.println("Here are the midterm grades of the 5 students above:");
       for(int j = 0; j < val; j++){
       System.out.println(students[j] + ":" + midterm[j]);
       
       }
       
    }
}