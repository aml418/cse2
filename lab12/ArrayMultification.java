//Anna Li // lab 12
//In this lab, you will create a ragged array and manipulate its data.
public class ArrayMultification{
    //main method
    public static void main(String[] args){
        
    }//end of main
    //raggedArray()
    public static int[] raggedArray(){
        //int [][] array1;
        int i = (int)(Math.random()*10 + 10);
        int j = (int)(Math.random()*10 + 10);
        int [][] array1 = new int [i][j];
        for (int k; k < i; k++){
            for(int m; m < j; j++){
            array1 [k][m] = (int)(Math.random() * 2000 - 1000);
            }
        }
    }//end of raggedArray()



    //Write a method printArray()
    public static void printArray(int[][] array){
        for(int row = 0; row < array.length;row++){
            for(int column = 0; column < array[row].length;column++){
                String.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }//end of printArray
    
    //printArray() that accepts a one dimensional array of integers
    public static void printArray(int[] array){
        for(int post = 0; post < array.length; post++){
            System.out.print(array[post] + " ");
        }
        System.out.println();
    }//end of single[] printArray
    
    //a method findSmallest() 
    public static int[][] findSmallest(int[][] array){
        int smallest = 25;//a number that is larger than 20 to make sure.
        for(int first = 0; first < array.length; first++){
            for(int second = 0; second < array[first].length;second++){
                if(second < smallest){
                    int result = array[first][second];
                    return ;
                }
                else{
                    second = smallest;
                }
                return array[first][second];
            }
        }
    }//end of findSmallest() 
    
    //findLargest() 
    public static int[][] findLargest(int[][] array, int x, int y){
        int location1 = 0;
        int location2 = 0;
        int[] location ={0,0};
        int largest = array[0][0];
        for(int w = 0; w < x; w++){
            for(int p = 0; p < y; y++){
                if(array[w][p]>largest){
                    location[0] = w;
                    location1 = w;
                    location[1] = p;
                    largest = array[w][p];
                    
                }
            }
        }
    System.out.println("The location of the largest element of your 2D array is: (" + location[0] + ", " + location[1] + ")");
    System.out.println(array[location1][location2]);
    return location;
    }//end of findlargest
    
    //mosteven method
    public static int[][] mostEven(int[][] array){
        int mostEvenArray = -1000;
        for(int ini = 0; ini < array.length; ini++){
            for(int sec = 0; sec < array[ini].length; sec++){
                if(array[ini][sec] % 2 == 0){
                    if(array[ini][sec] > -1000){
                        array[ini][sec] = mostEvenArray;
                    }
                }
            }
        }
        int[][] mostEvenArray = array[ini][sec];
        return [][]mostEvenArray;
    }//end of mostEven
}//end of class