//Anna Li, hw 10
//import java
import java.util.Scanner;
//define a class
public class Shuffling{
    //define the method printArray
    public static void printArray(String[] cards){//print out all the cards in the deck
        System.out.print(cards + " ");
    }
    //define another mthod shuffle
    public static void shuffle(String[] deck) {
		for ( int i = 0; i < 52 ; i++ ) {
			int j = ( int ) ( Math.random( ) * 52 );  // random numbers 0 - 51
			String temp = deck[ i ];  // card from deck stored in temp
			deck[ i ] = deck[ j ];  // the card's place is taken by another card selected at random
			deck[ j ] = temp;  // the random card's place is taken by the original card
		}
	}
    
    public static void randomizeHand(String[] suitnames, String[] rankNames){
        int[] hand = new int[5];
        for(int i = 1; i <= 5; i++){
            int index = (int)(Math.random() * 52);
            hand[i] = index;
            rankNames[i] = rankNames[hand[index]];
        }
    }
    
    //call the main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    //suits club, heart, spade or diamond
        String[] suitNames = {"C","H","S","D"};   
        String[] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i = 0; i < 52; i++){
            cards[i] = rankNames[ i % 13 ] + suitNames[ i / 13 ];
            System.out.print(cards[i]+" ");
        }
        printArray(cards);//print out all the cards in the deck
        shuffle(cards);
        System.out.print("shuffled");
        printArray(cards);
        //hand = randomizeHand(suitNames,rankNames);
        System.out.print("Randomized hand!");
        //printArray(hand);
    }
}