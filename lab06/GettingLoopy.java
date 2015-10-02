/*Anna Li; lab06; Oct 2nd;get familiar with loops*/
//define a class
public class GettingLoopy {
    //declare a method 
    public static void main(String[] args){
        int counter = 0;
        int num = 0;
        System.out.println("Step 1:");
        while (counter < 7){
            counter++;
            System.out.print (counter);
        }
        while(counter >= 7 && counter < 14){
            System.out.print ("7");
            counter++;
        }
        System.out.println("\nStep 2: while loop");
        int primeNum = 11;
        int capacity = 101;
        while (primeNum < capacity){
            if (primeNum % 2 != 0 && primeNum % 3 != 0 && primeNum % 5 != 0 &&
            primeNum % 7 != 0){
                System.out.print(" "+ primeNum + " ");
            }
             primeNum++;
        }
        System.out.println("\nFor loop:");
        for (primeNum = 11;primeNum < 101;primeNum++){ 
            if (primeNum % 2 != 0 && primeNum % 3 != 0 && primeNum % 5 != 0 &&
            primeNum % 7 != 0){
                System.out.print (" " + primeNum + " ");
            }
            }
        System.out.println("\nDo While Loop:");
        int primeNum1 = 11;
        int capacity1 = 101;
        do{
            if (primeNum1 % 2 != 0 && primeNum1 % 3 != 0 && primeNum1 % 5 != 0 &&
            primeNum1 % 7 != 0){
                System.out.print(" " + primeNum1 + " ");}
            primeNum1++;
           }while(primeNum1 > 10 && primeNum1 < 100);
}
}