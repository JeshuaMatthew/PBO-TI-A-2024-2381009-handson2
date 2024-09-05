package binaryoperator;

public class Assignment {
    public static void main(String[] args) {
        // 1. operator assignment dasar

        int angka = 10;
        String nama = "Alice";

        System.out.println("Nilai angka : " + angka);
        System.out.println("Nilai nama : " + nama);

        // 2. operator assignment aritmatika

        int x = 5;
        x += 3;
        System.out.println("Nilai x Setelah += 3 : " + x);

        int y = 10;
        y -= 2;
        System.out.println(x);
        System.out.println("Nilai y Setelah -= 2 : " + y);

        int z = 10;
        z *= 2;
        System.out.println(z);
        System.out.println("Nilai z Setelah *= 2 : " + z);

        int c = 10;
        c /= 2;
        System.out.println(c);
        System.out.println("Nilai c Setelah /= 2 : " + c);

        int b = 10;
        b %= 2;
        System.out.println(b);
        System.out.println("Nilai c Setelah %= 2 : " + b);


    }
}
