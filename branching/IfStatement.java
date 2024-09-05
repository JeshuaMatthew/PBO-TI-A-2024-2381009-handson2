package branching;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        // untuk bikin object input, yang berjenis scanner

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nomor hari (1 - 7) : ");

        // mendetek integer ".nextInt"
        // mirip seperti scanf
        int nomorHari = input.nextInt();

        String namaHari = "";

        if (nomorHari == 1) {
            namaHari = "minggu";
        } else if (nomorHari == 2) {
            namaHari = "senin";
        } else if (nomorHari == 3) {
            namaHari = "selasa";
        } else if (nomorHari == 4) {
            namaHari = "rabu";
        } else if (nomorHari == 5) {
            namaHari = "kamis";
        } else if (nomorHari == 6) {
            namaHari = "jumat";
        } else if (nomorHari == 7) {
            namaHari = "sabtu";
        } else {
            System.out.println("Masukan nomor antara 1 - 7");
            System.exit(0);
        }

        System.out.println("Hari : " + namaHari);
    }
}
