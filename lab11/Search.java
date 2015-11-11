//Anna Li lab11
//import Scanner 
import java.util.Scanner;
public class Search{
    public static void main(String[] agrs){
        int[] arrayOne;//declare an array
        arrayOne = new int[5000]; //allocate the size
        for(int i = 0; i < 5000; i++){
            int number  = (int)(Math.random() * 100000);//Fill array1 with random integers between 0 and 10000
            arrayOne [i] = number;
        }
        //Use linear search to print out the minimum and maximum values of array1.
        int min = 100000;
        for(int i=0; i<5000; i++){
            if(min > arrayOne[i]){
                min = arrayOne[i];
            } 
        }
        int max = 0;
        for(int k = 0; k < 5000; k++){
            if (max < arrayOne[k]){
                max = arrayOne[k];
            }
        }
        //print out the max/min for array1
        System.out.println("The max for array one is:" + max);
        System.out.println("The min for array two is: " + min);
        
        
        int[] arrayTwo;
        arrayTwo = new int[5000];
        for(int j =0; j < 5000; j++){
            int randomNum = (int)(Math.random() * 1000000 + 3);
            arrayTwo [j] = j * randomNum;
        }
        
        //print out the max/min for array2
        int min2 = arrayTwo[0];
        int max2 = arrayTwo[5000-1];
        System.out.println("The max for array two is: " + max2);
        System.out.println("The min for array two is: " + min2);
        
        
        
        //Prompt the user to enter an int >= 0, and exit the program if they do not enter an int >= 0.
        System.out.print("Please enter a positive integer:");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput < 0){
            System.out.print("  ");//leave the program
        }
        else{
            for (int c = 0; c < 5000; c++){
               int search = userInput; 
               int first  = 0;
               int last   = 5000-1;
               int middle = (first + last)/2;
               if ( min2 > userInput ){
                       System.out.println(userInput + " is not found.");
                       System.out.println("The number above it is " + min);
                       System.out.println("The number below it is none.");
                       break;
                   }
               
                   while( userInput >= min2 ){
                       if ( arrayTwo[middle] < arrayTwo[search] ){
                          first = middle + 1;    
                   }
                   else if ( arrayTwo[middle] == arrayTwo[search] ){
                       System.out.println(search + " found at location " + (middle + 1) + ".");
                       break;
                   }
                   else{
                      last = middle - 1;
                      middle = (first + last)/2;
                   }
                   } 
             
            }
        }
        

    }
}