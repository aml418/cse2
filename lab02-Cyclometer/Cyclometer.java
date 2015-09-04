//Anna Li
//My bicycle cyclometer
//
//define a class
public class Cyclometer{
    public static void main(String[] args){
        
int secsTrip1=480;  // seconds need for trip 1
int secsTrip2=3220;  // seconds need for trip 2
int countsTrip1=1561;  // rotations for trip 1
int countsTrip2=9037; // rotations for trip 2
double wheelDiameter=27.0; // diameter of wheel in inches
double PI=3.14159; //
double feetPerMile=5280; // conversion between feet and mile 
double inchesPerFoot=12;   // conversion between inch and foot
double secondsPerMinute=60;  // conversion between second and minute
// print out the calculation 
System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
// calculate the total distance 
double distanceTrip1 = PI * 2 * wheelDiameter * inchesPerFoot*feetPerMile * countsTrip1; // Gives distance in miles
double distanceTrip2 = PI * 2 * wheelDiameter * inchesPerFoot*feetPerMile * countsTrip2; // Gives distance in miles
double totalDistance = distanceTrip1+distanceTrip2;// caluculate the total distance
// print out distance1, distance2 and total distance
System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
System.out.println("Trip 2 was" + distanceTrip2 + " miles.");
System.out.println("The totoal distance was" + distanceTrip1 + distanceTrip2 + " miles.");
         }
}