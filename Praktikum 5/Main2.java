public class Main2 {
    public static void main(String[] args) {
        cetakSegitigaSiku(1, 1, 5);
    }
    static void cetakSegitigaSiku(int row, int col, int batas) {
        if (row <= batas) {
            if (col <= row) {
                System.out.print("* ");
            } 
            if (col == row ) {
                System.out.println();
                cetakSegitigaSiku(++row, 1, batas);
            } else {
                cetakSegitigaSiku(row,++col,batas);
            }
        }
    }
}
