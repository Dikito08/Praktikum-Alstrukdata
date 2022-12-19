import java.util.Scanner;

public class MenuDoubleLinkedList{
    public static void Menu() {
        System.out.println("=========================================");
        System.out.println("         MENU Double LinkedList");
        System.out.println("=========================================");
        System.out.println("1. Tambah data barang");
        System.out.println("2. Hapus data barang");
        System.out.println("3. Pencarian data barang");
        System.out.println("4. Pengurutan data barang");
        System.out.println("5. Tampilkan data barang");
        System.out.println("6. Keluar");
    }
    public static void main(String[] args){
        DoubleLinkedList DList = new DoubleLinkedList();
        
        Scanner input = new Scanner(System.in);
        while (true) {
            Menu();
            System.out.print("Pilihan : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1 :
                    Scanner input1 = new Scanner(System.in);
                    Scanner tambah = new Scanner(System.in);
                    int pilih1;
                    System.out.println("1. Tambah Awal");
                    System.out.println("2. Tambah Akhir");
                    System.out.print("Pilihan : ");
                    pilih1 = input1.nextInt();
        
                    switch (pilih1) {
                        case 1 :
                            System.out.print("Data : ");
                            DList.insertFirst(tambah.nextLine());
                            break;
                        case 2 :
                            System.out.print("Data : ");
                            DList.insertLast(tambah.nextLine());
                    }
                    break;
                case 2 :
                    Scanner input2 = new Scanner(System.in);
                    int pilih2;
                    System.out.println("1. Hapus Awal");
                    System.out.println("2. Hapus Akhir");
                    System.out.print("Pilihan : ");
                    pilih2 = input2.nextInt();
        
                    switch (pilih2) {
                        case 1 :
                            DList.deleteFirst();
                            break;
                        case 2 :
                            DList.deleteLast();
                    }
                    break;
                case 3 :
                case 4 :
                case 5 :
                    DList.displayForward();
                    DList.displayBackward();
                    break;
                case 6 :
                    return;
                default :
                    System.out.println("Masukkan inputan yang tersedia");
            }
        }
    }
}









    



