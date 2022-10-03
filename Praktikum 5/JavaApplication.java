public class JavaApplication {
    public static void main(String[] args) {
        int hasil = rekursif(5);
        System.out.print(hasil);
    }
    public static Integer rekursif(int n) {
        if (n == 0 || n == 1) {
                return 1;
        } else {
            return n* rekursif(n-1);
        }
    }
}
