//Anna Li Hw11 Fun with Seaching
//import Scanner
import java.util.Scanner;
import java.util.Arrays;//for sorting later 
public class CSE2Linear{
    public static void main(String[] args){
        int studentGrade[];//decalre an array
        studentGrade = new int[15];//allocate the size
        System.out.print("Please enter an integral ranging from 0 to 100: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 15; i++){
            //check the input 
            boolean userInput = false;
            while(!userInput){
                if (input.hasNextInt()){
                    int value = input.nextInt();
                    //System.out.println(value);
                    if(value < 0){
                       System.out.print("Out of range!");
                       input.nextInt();
                       break;
                    }
                    if(value> 100){//error message for an int that is out of the range from 0-100
                        System.out.print("Out of range!");
                        input.nextInt();
                        break;
                    }//end of if
                    if(i>0){
                        if(studentGrade[i-1] >= value ){// not greater than or equal to the last int.
                        System.out.print("The number should be larger than the last one.");
                        input.nextInt();
                        break;
                        }
                    }
                    studentGrade[i] = value;
                    userInput = true;
                }
                else if(!input.hasNextInt()){// if the user enters anything other than an int.
                    System.out.print("Not an integer.");
                    input.nextInt();
                    break;
                }//end of else if
            }//end of while
        }//end of for
        System.out.print("User initial input:");
        printArray(studentGrade);//Print the final input array.
        //print the sorted 
        Arrays.sort(studentGrade);
        printArray(studentGrade);//print the sorted array
        
        System.out.print("Enter a grade to search:");
        //Scanner input = new Scanner(System.in);
        int userSearch1 = input.nextInt();//enter a grade to be searched for
        int first  = 0;
        int last   = 14;
        int middle = (first + last)/2;
        int i = 0;
        while(studentGrade[middle] != userSearch1){
            //System.out.println("first: " + first + " middle: " + middle + "last: " + last);
            i++;
            if (studentGrade[middle] < userSearch1  ){
                    first = middle;
                    //continue;
                }
            else if(last - first  == 1 || last <= first ){
                System.out.println("The number is not found.");
                break;
            }
            else{
                last = middle;
            }
            middle = (first + last)/2;
        }
        System.out.println(userSearch1 + " found at location with " + i + " iteration.");
        
        
        
        shuffle(studentGrade);//scramble the sorted array randomly
        System.out.println("Shuffled: ");
        printArray(studentGrade);//print out the scrambled array
         //ask the user for input
        System.out.print("Enter a grade to search:");
        //Scanner input = new Scanner(System.in);
        int userSearch2 = input.nextInt();
        int j = 0;
        for ( int w = 0; w < 15; w++){
            j++;
            if (studentGrade[w] == userSearch2){     /* Searching element is present */
                System.out.println(userSearch2 + " is found with  " + j + "  iteration.");
                break;
            }   
            } 
    }//end of main method
        
        public static void shuffle(int [] studentGrade){
            for(int m = 0; m<15; m++){   
                int studentGradeNew = studentGrade[0];
                int x = (int) (Math.random()*15); // shuffle the cards with a random number each time
                studentGrade [0] = studentGrade [x];
                studentGrade [x] = studentGradeNew;
            }
            /*
            for (int i = 0; i < 15; i++) {
                System.out.print(studentGrade[i] + " ");  
            }
            */
    
        }
        
        public static void printArray(int [] cards){
            for (int i = 0; i < 15; i++) {
                System.out.print(cards[i] + " ");  
            }    
        }
              
}//end of class