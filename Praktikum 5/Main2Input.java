import java.util.Scanner;

public class Main2Input {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        int x;
        
        boolean menu =true;

         System.out.print("\nMasukkan nilai x : ");
         x = scan.nextInt();
         
         for (int a = 1; a <= x; a++){
            for(int b = 1; b <= a; b++){
                System.out.print ("*");
            }
                System.out.println();
         }
    }
}