//Anna Li
// This program will first generate random numbers between 1 to 52
//Use if statements to assign the suit name.
//Use a switch statement to assign the card identity.
//Print out the name of the randomly selected card.
//
//import math method 

//define a class
public class CardGenerator{;
    //declare a mathod
    public static void main(String[] args){;
    String suit="";
    String cardnumber="";
    int randomNumber = (int) (Math.random() * 52 + 1);
    //System.out.println(randomNumber);
        if (randomNumber >= 1 && randomNumber <= 13){
            suit = "diamonds";
        }
        else if (randomNumber > 13 && randomNumber <= 26){
            suit = "clubs";
        }
        else if (randomNumber > 26 && randomNumber <= 39){
            suit = "hearts";
        }
        else if (randomNumber > 39 && randomNumber <= 52){
            suit = "spades";
        }
    switch(randomNumber % 13){
        case 0:
        cardnumber = "Ace";
        break;
        
        case 1:
        cardnumber = "2";
        break;
        
        case 2:
        cardnumber = "3";
        break;
        
        case 3:
        cardnumber = "4";
        break;
        
        case 4:
        cardnumber= "5";
        break;
        
        case 5:
        cardnumber = "6";
        break;
        
        case 6:
        cardnumber = "7";
        break;
        
        case 7:
        cardnumber = "8";
        break;
        
        case 8:
        cardnumber ="9";
        break;
        
        case 9:
        cardnumber ="10";
        break;
        
        case 10:
        cardnumber= "Jack";
        break;
        
        case 11:
        cardnumber= "Queen";
        break;
        
        case 12:
        cardnumber = "King";
        break;
        
    }  
      //print out the line
      System.out.println("You picked the " + cardnumber + " of " + suit);
        
    }
}