import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Hashtable;
import java.util.Enumeration;

public class Quiz {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("===========================");
            System.out.println("           MENU");
            System.out.println("===========================");
            System.out.println("1. Collection");
            System.out.println("2. Hash");
            System.out.println("3. Keluar");
            System.out.println("Pilihan : ");
            int pilih = input.nextInt();

            switch(pilih) {
                case 1 :
                    List<String> list = new ArrayList<>();
                    list.addAll(List.of("Kensa","Hubbal","Fauzan","Kirei"));
            
                    Collections.sort(list);
            
                    for (var value : list) {
                        System.out.println(value);
                    }
                    break;
                case 2 :
                    Scanner input2 = new Scanner(System.in);
                    Enumeration names;
                    String kunci;
    
                    Hashtable<String, String> hashtable = new Hashtable<String, String>();
            
                    System.out.println(" =============== KAMUS INFORMATIKA ===============\n");
            
                    hashtable.put("Assembly", "Proses penerjemahan program yang ditulis dengan bahasa pemrograman simbol ke dalam bahasa mesin");
                    hashtable.put("Algoritma", "instruksi yang ditujukan ke komputer agar dirinya bisa menyelesaikan tugas yang diberikan");
                    hashtable.put("Coding", "Penulisan Program");
                    hashtable.put("Compiling", "Proses penerjemahan ke bahasa mesin");
                    hashtable.put("Debugging", "Kesalahan dalam coding");
                    hashtable.put("Database", "Kumpulan data yang dikelola sedemikian rupa berdasarkan ketentuan tertentu yang saling berhubungan sehingga mudah dalam pengelolaannya");
                    hashtable.put("Gateway", "Sebuah mekanisme yang menyediakan akses ke sebuahsistem lain yang terhubung dalam sebuah network");
                    hashtable.put("HTML", "Hyper Text Markup Language yaitu bahasa pemograman untuk membuat web");
                    hashtable.put("Flow Chart", "Salah satu tool untuk mereferensikan algoritma");
                    hashtable.put("Kode program", "suatu rangkaian pernyataan atau deklarasi yang ditulis dalam bahasa pemrograman komputer yang terbaca manusia");
            
                    System.out.println(" Daftar istilah dalam kamus\t: ");
                    Enumeration en = hashtable.keys();
                    while(en.hasMoreElements()) {
                        System.out.println(" "+en.nextElement());
                    }
    
                    System.out.print("\nMasukan Istilah yang ingin anda cari\t: ");
                    String cari = input2.nextLine();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" |"+cari+ "| adalah  " +hashtable.get(cari));
                    System.out.println("----------------------------------------------------------------");
                    break;
                case 3 :
                return;
                default :
                System.out.println("Input Salah!");
    
            }
        }
        
    }
}
