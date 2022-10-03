import java.util.Scanner;
public class AngkaPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, bil;
        boolean bilPrima = true;

        System.out.println("PROGRAM MENGECEK BILANGAN PRIMA");
        System.out.println("===================================");
        System.out.print("\nMasukkan sebuah bilangan: ");
         x = input.nextInt();

        if (x == 0 || x == 1) {
            bilPrima = false;
        }
        else {
            for (bil = 2; bil <= x/2; bil++) {
                if (x % bil == 0) {
                    bilPrima = false;
                    break;
                }
            }
        }
        if (bilPrima) {
            System.out.println(x + " Termasuk Bilangan Prima");
        }
        else {
            System.out.println(x + " Bukan Termasuk Bilangan Prima");
        }
    }
}
