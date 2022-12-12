import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class MenuCollection {
    public static void Menu() {
        System.out.println("===================================");
        System.out.println("         MENU COLLECTION");
        System.out.println("===================================");
        System.out.println("1. HashSet");
        System.out.println("2. Treeset");
        System.out.println("3. LinkedHashSet");
        System.out.println("4. ArrayList");
        System.out.println("5. Keluar");
    }
    public static void Menu1() {
        HashSet <String> hset = new HashSet <String>();
        Scanner input1 = new Scanner(System.in);
        int pilih1;
        while (true) {
            System.out.println("1. Tampilkan data HashSet");
            System.out.println("2. Tambahkan data HashSet");
            System.out.println("3. Hapus data HashSet");
            System.out.println("4. Kembali");
            System.out.print("Pilihan : ");
            pilih1 = input1.nextInt();

            switch (pilih1) {
                case 1 :
                    System.out.println(hset);
                    break;
                case 2 :
                    System.out.print("Data yang ingin ditambah : ");
                    int jumlah = input1.nextInt();
                    System.out.println("Masukkan Data : ");
                    for (int x = 0;x <= jumlah;x++) { 
                        hset.add(input1.nextLine());
                    }
                    break;
                case 3 :
                    System.out.print("Data yang mau dihapus : ");
                    hset.remove(input1.nextLine());
                    break;
                case 4 :
                    return;
                default :
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            Menu();
            System.out.print("Pilihan : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1 :
                    Menu1();
            }
        }
    }
}