public class DemoKonversi {
    public static void main(String[] args) {
        int a = 257;
        double d = 274.5678;

        // typecasting dari tipe int ke tipe byte
        byte b;
        b = (byte) a;
        System.out.println("Typecasting dari tipe int ke tipe byte");
        System.out.println("int : " + a);
        System.out.println("byte : " + b);

        //typecasting dari tipe double ke tipe int
        int x;
        x = (int) d;
        System.out.println("\nTypecasting dari tipe double " + "ke tipe int");
        System.out.println("double : " + d);
        System.out.println("int : " + x);

        //typecasting dari tipe double ke tipe byte
        b = (byte) d;
        System.out.println("\nTypecasting dari tipe rouble" + "ke tipe byte");
        System.out.println("double : " + d);
        System.out.println("byte : " + b);
    }
    
}
