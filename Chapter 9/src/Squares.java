
public class Squares {

    public static void main(String[] args) {

        int[] squared = new int[5];
        
        for (int i = 0; i < squared.length; i++) {
            squared[i] = square(i);
        }
        
       
        print(squared);
    }

    public static int square(int i) {
        return i * i;
    }
    
    public static void print(int[] squared) {
        for (int i = 0; i < squared.length; i++) {
            System.out.println("Square value of " + i + " is " + squared[i]);
        }
    }
}



/*Screen Dump 

Square value of 0 is 0
Square value of 1 is 1
Square value of 2 is 4
Square value of 3 is 9
Square value of 4 is 16



*/