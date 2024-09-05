package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // sama dengan
        boolean hasilSamaDengan = (a == b);
        System.out.println("a == b : " + hasilSamaDengan);

        // tidak sama dengan
        boolean hasilTidakSamaDengan = (a != b);
        System.out.println("a != b : " + hasilTidakSamaDengan);

        // lebih besar dari
        boolean hasilLebihBesar = (a > b);
        System.out.println("a > b : " + hasilLebihBesar);

        // lebih kecil dari
        boolean hasilLebihKecil = (a < b);
        System.out.println("a < b : " + hasilLebihKecil);

        // lebih besar / sama dengan
        boolean hasilLebihBesarSamaDengan = (a >= b);
        System.out.println("a >= b : " + hasilLebihBesarSamaDengan);

        // lebih kecil / sama dengan
        boolean hasilLebihKecilSamaDengan = (a <= b);
        System.out.println("a <= b : " + hasilLebihKecilSamaDengan);
    }
}
