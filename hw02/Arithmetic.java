//Anna Li
//Homewrok 2 
//Arithmetic
//
//define a class
public class Arithmetic{
    // main method 
    public static void main (String[] args){
        
// input the assumputions
int nSocks = 3; // number of pairs of socks 
double sockCost$ = 2.58; // cost per pair of socks
//
int nDrinkGlass = 6; // number of drink glass
double glassCost$ = 2.29; //cost per glass
//
int nEnvelopes = 1; // number of box of envelopes
double envelopesCost$ = 3.25; // cost per box of envelopes 
//
double tax = 0.06; // tax 
//calculate cost of each of item and the sales tax for that item
//For socks
double socksBeforeTax = nSocks * sockCost$;
double taxSocks = socksBeforeTax * tax;
double socksTotal = socksBeforeTax + taxSocks;
//For drink glass
double glassBeforeTax = nDrinkGlass * glassCost$;
double taxDrink = glassBeforeTax * tax;
double drinkTotal = glassBeforeTax + taxDrink;
//For envelopes
double envelopesBeforeTax = nEnvelopes * envelopesCost$ ;
double taxEnvelopes = envelopesBeforeTax * tax;
double envelopesTotal = envelopesBeforeTax + taxEnvelopes;
//For all items
double allItemsActual = socksTotal + drinkTotal + envelopesTotal;
double allItemsBeforeTax = socksBeforeTax + glassBeforeTax + envelopesBeforeTax;
//display all the results
System.out.println("The socks is " + sockCost$ +" per pair. The cost of " + nSocks +
" pairs of socks is " + Math.round(socksBeforeTax * 100)/100 + " dollars." + "The sale tax for socks is " + 
taxSocks + " dollars." + "The total cost of socks is " + socksTotal + " dollars.");
System.out.println("The drink glass is " + glassCost$ + " for one. The cost of " + 
nDrinkGlass + " is " + glassBeforeTax + " dollars." + "The sale tax for drink glass is " 
+ taxDrink + " dollars." + "The total cost of drink glass is " + Math.round(drinkTotal*100)/100 + " dollars.");
System.out.println("The envelopes is " + envelopesCost$ + " per box. The cost of " + 
nEnvelopes + "is " + envelopesBeforeTax + " dollars." + "The sale tax for envelopes is " +
taxEnvelopes + " dollars." + "The total cost of envelopes is " + envelopesTotal + " dollars.");
System.out.println("The total cost for three itmes before tax is " + allItemsBeforeTax + 
" dollars." + "The total cost fot three items after tax is " + allItemsActual + " dollars.");
    }
}