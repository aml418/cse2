//Anna Li
//Homework 6

//import scanner
import java.util.Scanner;
//define a class
public class BarGraph{
//declare a method
public static void main(String[] args){
Scanner input = new Scanner(System.in);
//for Monday and check if it it positive number
System.out.print("Expenses for Monday: $");
float moneySpent1 = input.nextFloat();
while (moneySpent1 <= 0){
    System.out.print("Sorry, please try again.");
    System.out.print("Expenses for Monday: $");
    moneySpent1 = input.nextFloat();
}
//for Tue and check if it is postive.
System.out.print("Expenses for Tuesday: $");
float moneySpent2 = input.nextFloat();
while (moneySpent2 < 0){
    System.out.print("Sorry, please try again.");
    System.out.print("Expenses for Tuesday: $");
    moneySpent2 = input.nextFloat();
}
// for Wednesday and check if it is postive.
System.out.print("Expenses for Wednesday: $");
float moneySpent3 = input.nextFloat();
while (moneySpent3 < 0){
    System.out.print("Sorry, please try again.");
    System.out.print("Expenses for Wednesday: $");
    moneySpent3 = input.nextFloat();
}
// For Thursday and check if it is postive.
System.out.print("Expenses for Thursday: $");
float moneySpent4 = input.nextFloat();
while(moneySpent4 < 0){
    System.out.print("Sorry, please try again.");
    System.out.print("Expenses for Thursday: $");
    moneySpent4 = input.nextFloat();
}
//For Friday and check if it is postive.
System.out.print("Expenses for Friday: $");
float moneySpent5 = input.nextFloat();
while (moneySpent5 < 0 ){
    System.out.print("Sorry, plesae try again.");
    System.out.print("Expenses for Friday: $");
    moneySpent5 = input.nextFloat();
} 
//For Sat and check if it is postive.
System.out.print("Expenses for Saturday: $");
float moneySpent6 = input.nextFloat();
while (moneySpent6 < 0 ){
    System.out.print("Sorry, plesae try again.");
    System.out.print("Expenses for Saturday: $");
    moneySpent6 = input.nextFloat();
}
//For Sun and check if it is postive.
System.out.print("Expenses for Sunday: $");
float moneySpent7 = input.nextFloat();
while(moneySpent7 < 0){
    System.out.print("Sorry, please try again.");
    System.out.print("Expenses for Sunday: $");
    moneySpent7 = input.nextFloat();
}

//print the bars
int i;
System.out.print("Mon: ");
for (i = 1; i <= moneySpent1; i++){
    System.out.print("*");
}
if (moneySpent1 - ((int) moneySpent1) > 0.5){
    System.out.print("*");
    }
    
int j;
System.out.print("\nTue: ");
for(j = 1; j <= moneySpent2; j++){
    System.out.print("*");
}
if (moneySpent2 - ((int) moneySpent2) > 0.5){
    System.out.print("*");
    }
    
int q;
System.out.print("\nWed: ");
for(q =1; q <= moneySpent3; q++){
    System.out.print("*");
}
if (moneySpent3 - ((int) moneySpent3) > 0.5){
    System.out.print("*");
    }
    
int w;
System.out.print("\nThur: ");
for(w = 1; w <= moneySpent4; w++){
    System.out.print("*");
}
if (moneySpent4 - ((int) moneySpent4) > 0.5){
    System.out.print("*");
    }
    
int e;
System.out.print("\nFri: ");
for(e = 1; e <= moneySpent5; e++){
    System.out.print("*");
}
if (moneySpent5 - ((int) moneySpent5) > 0.5){
    System.out.print("*");
    }
    
int r;
System.out.print("\nSat: ");
for(r = 1; r <= moneySpent6; r++){
    System.out.print("*");
}
if (moneySpent6 - ((int) moneySpent6) > 0.5){
    System.out.print("*");
    }
    
int t;
System.out.print("\nSun: ");
for(t = 1; t <= moneySpent7; t++){
    System.out.print("*");
}
if (moneySpent7 - ((int) moneySpent7) > 0.5){
    System.out.println("*");
    }
//System.out.println("Mon:" + "")
//Calculate the average 
float average = (moneySpent7 + moneySpent6 + moneySpent5
+ moneySpent4 + moneySpent3 + moneySpent2 + moneySpent1) / 7;
System.out.printf("\nYour average weekly expenses are: $" + "%10.2f",average);
int randomNumber = (int)(Math.random()*20);
//System.out.println(randomNumber);
System.out.printf("\nEstimated expenditure for 4 years: $" + "%10.2f",average*(1 + randomNumber/100) *52);

}
}