package ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {

        // operator yang memerlukan 3 operand
        // operand = '(nilai >= 60)' 'Lulus'  'Tidak Lulus'

        int nilai = 75;
        String hasil = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.println(hasil);


    }
}
