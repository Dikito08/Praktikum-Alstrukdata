import java.util.Scanner;

class SearchingMahasiswa {
    public static void main(String args[]) {
        String x, search;
        int c, n, array[];
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa : ");
        x = in.nextLine();
        array = new int[n];
        System.out.println("Enter " + n + " integers");

        for (c = 0; c < n; c++) {
            array[c] = in.nextLine();
        }
        System.out.println("Enter value to find");
        search = in.nextLine();

        for (c = 0; c < n; c++) {
            if (array[c] == search) {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if (c == n) {
            System.out.println(search + " isn't present in array.");
        }
    }
}
