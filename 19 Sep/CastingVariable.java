import java.util.Scanner;

public class CastingVariable {
    public static void main(String[] args) {

        java.util.Scanner input = new Scanner(System.in);
        int var_alas = 9;
        int var_tinggi = 5;
        double rumus_luas;

        System.out.print("Masukkan alas : ");
        var_alas = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        var_tinggi = input.nextInt();

        rumus_luas = (float) (var_alas * var_tinggi)/2;
        System.out.println("Luas Segitiga : " + rumus_luas);
    }
    
}
