//Anna Li 
//homework #4 
//Randomly draw five cards from 5 decks
//compare them and decide if there are "a pair", "two pairs" and "three of a kind "
//define a clss
public class PokerHandCheck{;
//decare a method 
public static void main(String[] args){;
String suit1 = " "; //define suit1 and cardnumber1
String cardnumber1 = " ";
String suit2 = " ";//define suit2 and cardnumebr 2
String cardnumber2 = " ";
String suit3 = " ";//define suit3 and cardnumber3
String cardnumber3 = " ";
String suit4 = " ";//define suit4 and cardnumber4
String cardnumber4 = " ";
String suit5 = " ";//define suit5 and cardnumber5
String cardnumber5 = " ";
//ask java to generate 5 cards from 5 decks
int randomNumber1 = (int) (Math.random() * 52 + 1); //generate a cardnumber from first deck
int randomNumber2 = (int) (Math.random() * 52 + 1);//generate a cardnumber from second deck
int randomNumber3 = (int) (Math.random() * 52 + 1);//generate a cardnumber from third deck
int randomNumber4 = (int) (Math.random() * 52 + 1);//generate a cardnumber from fourth deck
int randomNumber5 = (int) (Math.random() * 52 + 1);//generate a cardnumber from fifth deck
// decide the suits for each deck
if (randomNumber1 >=1 && randomNumber1 <=13){
    suit1 = "diamonds";
}
else if (randomNumber1 >=14 && randomNumber1 <=26){
    suit1 = "clubs";
}
else if (randomNumber1 >=27 && randomNumber1 <=39){
    suit1 = "hearts";
}
else if (randomNumber1 >=40 && randomNumber1 <=52){
    suit1 = "spades";
}
//the end of the if statement for decifing the suit for deck1
//use the same method to decide the suit for deck 2 
if (randomNumber2 >=1 && randomNumber2 <=13){
    suit2 = "diamonds";
}
else if (randomNumber2 >=14 && randomNumber2 <=26){
    suit2 = "clubs";
}
else if (randomNumber2 >=27 && randomNumber2 <=39){
    suit2 = "hearts";
}
else if (randomNumber2 >=40 && randomNumber2 <=52){
    suit2 = "spades";
}
//the end of the if statement for decifing the suit for deck2
//use the same method to decide the suit for deck 3
if (randomNumber2 >=3 && randomNumber3 <=13){
    suit3 = "diamonds";
}
else if (randomNumber3 >=14 && randomNumber3 <=26){
    suit3 = "clubs";
}
else if (randomNumber3 >=27 && randomNumber3 <=39){
    suit3 = "hearts";
}
else if (randomNumber3 >=40 && randomNumber3 <=52){
    suit3 = "spades";
}
//the end of the if statement for decifing the suit for deck3
//use the same method to decide the suit for deck 4
if (randomNumber4 >=3 && randomNumber4 <=13){
    suit4 = "diamonds";
}
else if (randomNumber4 >=14 && randomNumber4 <=26){
    suit4 = "clubs";
}
else if (randomNumber4 >=27 && randomNumber4 <=39){
    suit4 = "hearts";
}
else if (randomNumber4 >=40 && randomNumber4 <=52){
    suit4 = "spades";
}
//the end of the if statement for decifing the suit for deck4
//use the same method to decide the suit for deck 5
if (randomNumber5 >=3 && randomNumber5 <=13){
    suit5 = "diamonds";
}
else if (randomNumber5 >=14 && randomNumber5 <=26){
    suit5 = "clubs";
}
else if (randomNumber5 >=27 && randomNumber5 <=39){
    suit5 = "hearts";
}
else if (randomNumber5 >=40 && randomNumber5 <=52){
    suit5 = "spades";
}
//the end of the if statement for decifing the suit for deck5
//
//use switch statement to assign the names for the card in deck1
switch (randomNumber1 % 13){//beginning of the switch statement
    case 0:
    cardnumber1 = "Ace";
    break;
    
    case 1:
    cardnumber1 = "2";
    break;
    
    case 2:
    cardnumber1 = "3";
    break;
    
    case 3:
    cardnumber1 = "4";
    break;
    
    case 4:
    cardnumber1 = "5";
    break;
    
    case 5:
    cardnumber1 = "6";
    break;
    
    case 6:
    cardnumber1 = "7";
    break;
    
    case 7:
    cardnumber1 = "8";
    break;
    
    case 8:
    cardnumber1 = "9";
    break;
    
    case 9:
    cardnumber1 = "10";
    break;
    
    case 10:
    cardnumber1 = "Jack";
    break;
    
    case 11:
    cardnumber1 = "Queen";
    break;
    
    case 12:
    cardnumber1 = "King";
    break;
    
 }//the end of the switch statement
 //use the same procedurece to find cardnumber in deck 2
switch (randomNumber2 % 13){//beginning of the switch statement
    case 0:
    cardnumber2 = "Ace";
    break;
    
    case 1:
    cardnumber2 = "2";
    break;
    
    case 2:
    cardnumber2 = "3";
    break;
    
    case 3:
    cardnumber2 = "4";
    break;
    
    case 4:
    cardnumber2 = "5";
    break;
    
    case 5:
    cardnumber2 = "6";
    break;
    
    case 6:
    cardnumber2 = "7";
    break;
    
    case 7:
    cardnumber2 = "8";
    break;
    
    case 8:
    cardnumber2 = "9";
    break;
    
    case 9:
    cardnumber2 = "10";
    break;
    
    case 10:
    cardnumber2 = "Jack";
    break;
    
    case 11:
    cardnumber2 = "Queen";
    break;
    
    case 12:
    cardnumber2 = "King";
    break;
    
 }//the end of the switch statement
 //use the same procedurece to find cardnumber in deck 3
switch (randomNumber3 % 13){//beginning of the switch statement
    case 0:
    cardnumber3 = "Ace";
    break;
    
    case 1:
    cardnumber3 = "2";
    break;
    
    case 2:
    cardnumber3 = "3";
    break;
    
    case 3:
    cardnumber3 = "4";
    break;
    
    case 4:
    cardnumber3 = "5";
    break;
    
    case 5:
    cardnumber3 = "6";
    break;
    
    case 6:
    cardnumber3 = "7";
    break;
    
    case 7:
    cardnumber3 = "8";
    break;
    
    case 8:
    cardnumber3 = "9";
    break;
    
    case 9:
    cardnumber3 = "10";
    break;
    
    case 10:
    cardnumber3 = "Jack";
    break;
    
    case 11:
    cardnumber3 = "Queen";
    break;
    
    case 12:
    cardnumber3 = "King";
    break;
    
 }//the end of the switch statement
  //use the same procedurece to find cardnumber in deck 4
switch (randomNumber4 % 13){//beginning of the switch statement
    case 0:
    cardnumber4 = "Ace";
    break;
    
    case 1:
    cardnumber4 = "2";
    break;
    
    case 2:
    cardnumber4 = "3";
    break;
    
    case 3:
    cardnumber4 = "4";
    break;
    
    case 4:
    cardnumber4 = "5";
    break;
    
    case 5:
    cardnumber4 = "6";
    break;
    
    case 6:
    cardnumber4 = "7";
    break;
    
    case 7:
    cardnumber4 = "8";
    break;
    
    case 8:
    cardnumber4 = "9";
    break;
    
    case 9:
    cardnumber4 = "10";
    break;
    
    case 10:
    cardnumber4 = "Jack";
    break;
    
    case 11:
    cardnumber4 = "Queen";
    break;
    
    case 12:
    cardnumber4 = "King";
    break;
    
 }//the end of the switch statement
  //use the same procedurece to find cardnumber in deck 5
 switch (randomNumber5 % 13){//beginning of the switch statement
    case 0:
    cardnumber5 = "Ace";
    break;
    
    case 1:
    cardnumber5 = "2";
    break;
    
    case 2:
    cardnumber5 = "3";
    break;
    
    case 3:
    cardnumber5 = "4";
    break;
    
    case 4:
    cardnumber5 = "5";
    break;
    
    case 5:
    cardnumber5 = "6";
    break;
    
    case 6:
    cardnumber5 = "7";
    break;
    
    case 7:
    cardnumber5 = "8";
    break;
    
    case 8:
    cardnumber5 = "9";
    break;
    
    case 9:
    cardnumber5 = "10";
    break;
    
    case 10:
    cardnumber5 = "Jack";
    break;
    
    case 11:
    cardnumber5 = "Queen";
    break;
    
    case 12:
    cardnumber5 = "King";
    break;
    
 }//the end of the switch statement
 //print out the cards
 System.out.println("Your random cards were:");
 System.out.println("the " + cardnumber1 + " of " + suit1);
 System.out.println("the " + cardnumber2 + " of " + suit2);
 System.out.println("the " + cardnumber3 + " of " + suit3);
 System.out.println("the " + cardnumber4 + " of " + suit4);
 System.out.println("the " + cardnumber5 + " of " + suit5);
//now we can compare these 5 different cards from 5 decks to decide if there are "a pair", which mean 2 out of 5 are the same, and the others are not the same.
//If there are "two pair", that means 2 out of 5 are the same and 2 out of the rest of 3 are the same.
//if there are "three of a kind", that means 3 out of 5 are the same and the rest are not the same.
//If all five cards are different, that means “high card hand”.

if ((randomNumber1 == randomNumber2 && randomNumber2 == randomNumber3 && randomNumber1 != randomNumber4 && randomNumber4 != randomNumber5 && randomNumber1 != randomNumber5)||
(randomNumber1 == randomNumber2 && randomNumber2 == randomNumber4 && randomNumber1 != randomNumber3 && randomNumber3 != randomNumber5 && randomNumber1 != randomNumber5)||
(randomNumber1 == randomNumber2 && randomNumber2 == randomNumber5 && randomNumber1 != randomNumber3 && randomNumber3 != randomNumber4 && randomNumber1 != randomNumber4)||
(randomNumber1 == randomNumber3 && randomNumber3 == randomNumber4 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber5 && randomNumber1 != randomNumber5)||
(randomNumber1 == randomNumber3 && randomNumber3 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber4 && randomNumber1 != randomNumber4)||
(randomNumber1 == randomNumber4 && randomNumber4 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3 && randomNumber1 != randomNumber3)){
    System.out.println("You have three of a kind.");
}//the end of if statement
else   if (
(randomNumber1 == randomNumber2 && randomNumber3 == randomNumber4 && randomNumber1 != randomNumber3 && randomNumber3 != randomNumber5)||
(randomNumber1 == randomNumber2 && randomNumber3 == randomNumber5 && randomNumber1 != randomNumber3 && randomNumber3 != randomNumber4)||
(randomNumber1 == randomNumber2 && randomNumber4 == randomNumber5 && randomNumber1 != randomNumber4 && randomNumber4 != randomNumber3)||
(randomNumber1 == randomNumber3 && randomNumber2 == randomNumber4 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber5)||
(randomNumber1 == randomNumber3 && randomNumber2 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber4)||
(randomNumber1 == randomNumber3 && randomNumber4 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber4)||
(randomNumber1 == randomNumber4 && randomNumber2 == randomNumber3 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber5)||
(randomNumber1 == randomNumber4 && randomNumber2 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3)||
(randomNumber1 == randomNumber4 && randomNumber3 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3)||
(randomNumber1 == randomNumber5 && randomNumber2 == randomNumber3 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber4)||
(randomNumber1 == randomNumber5 && randomNumber2 == randomNumber4 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3)||
(randomNumber1 == randomNumber5 && randomNumber3 == randomNumber4 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3)){
    System.out.println("You have two pairs!");
}//end of else if
else if ((randomNumber1 == randomNumber2 && randomNumber1 != randomNumber3 && randomNumber3 != randomNumber4 && randomNumber4 != randomNumber5 && randomNumber1 != randomNumber4 && randomNumber3 != randomNumber5)||
(randomNumber1 == randomNumber3 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber4 && randomNumber4 != randomNumber5 && randomNumber1 != randomNumber4 && randomNumber2 != randomNumber5)||
(randomNumber1 == randomNumber4 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3 && randomNumber3 != randomNumber5 && randomNumber1 != randomNumber3 && randomNumber2 != randomNumber5)||
(randomNumber1 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3 && randomNumber3 != randomNumber4 && randomNumber1 != randomNumber3 && randomNumber2 != randomNumber4)||
(randomNumber2 == randomNumber3 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber4 && randomNumber4 != randomNumber5 && randomNumber1 != randomNumber4 && randomNumber2 != randomNumber5)||
(randomNumber2 == randomNumber4 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3 && randomNumber3 != randomNumber5 && randomNumber1 != randomNumber3 && randomNumber2 != randomNumber5)||
(randomNumber2 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3 && randomNumber3 != randomNumber4 && randomNumber1 != randomNumber3 && randomNumber2 != randomNumber4)||
(randomNumber3 == randomNumber4 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3 && randomNumber3 != randomNumber5 && randomNumber1 != randomNumber3 && randomNumber2 != randomNumber5)||
(randomNumber3 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3 && randomNumber3 != randomNumber4 && randomNumber1 != randomNumber3 && randomNumber2 != randomNumber4)||
(randomNumber4 == randomNumber5 && randomNumber1 != randomNumber2 && randomNumber2 != randomNumber3 && randomNumber3 != randomNumber4 && randomNumber1 != randomNumber3 && randomNumber2 != randomNumber4)){
    System.out.println("You have a pair.");
}//end of else if
else if ((randomNumber1 != randomNumber2) && (randomNumber2 != randomNumber3) && (randomNumber3 != randomNumber4)&& (randomNumber4 != randomNumber5)){
    System.out.println("You have a high card hand!");
}
}//the end of the main method
    
}//the end of the class