import java.util.Scanner;

public class SortingMahasiswa {
    String nim, nama;
    Scanner getdata = new Scanner(System.in);

    public void setdata() {
        System.out.print("Masukkan Nama      : ");
        this.nama = getdata.nextLine();
        System.out.print("Masukkan NIM       : \n\n");
        this.nim = getdata.nextLine();

    }

    public String getnim() {
        return this.nim;
    }

    public void tampil() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("NIM         : " + this.nim);

    }

    public static void main(String[] args) {
        Scanner getint = new Scanner(System.in);
        int a, z = 0, menu = 0;
        String nim;
        SortingMahasiswa[] mhs = new SortingMahasiswa[128];
        Scanner getdata = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PROGRAM SORTING MAHASISWA");
        while (menu != 5) {
            System.out.print("Menu : \n1. Input Data\n2. Tampilkan\n3. Keluar\npilihan : ");
            menu = getint.nextInt();
            if (menu == 1) {
                z++;
                mhs[z] = new SortingMahasiswa();
                mhs[z].setdata();
            } else if (menu == 2) {
                if (z < 1) {
                    System.out.println("Data Masih Kosong");
                } else {
                    a = 0;
                    while (a < z) {
                        a++;
                        System.out.println("---" + a + "---");
                        mhs[a].tampil();
                    }
                }
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("Masukkan Menu Yang Tersedia");
            }
        }
    }
}