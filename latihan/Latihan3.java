package latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        int operand[] = new int[2];
        int sum = 0;
        int typesOfOperator = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < operand.length; i++) {
            System.out.print("Masukan Bilangan ke - " + i + " : ");
            operand[i] = input.nextInt();
        }

        System.out.println("Pilih Tipe Operator ( pilih  1 - 5) : ");
        System.out.print("1. Tambah");
        System.out.print("2. Kurang");
        System.out.print("3. Bagi");
        System.out.print("4. Kali");
        System.out.print("5. Modulo");
        typesOfOperator = input.nextInt();

        switch (typesOfOperator){
            case 1:
                sum = operand[0] + operand[1];
                break;
            case 2:
                sum = operand[0] - operand[1];
                break;
            case 3:
                sum = operand[0] / operand[1];
                break;
            case 4:
                sum = operand[0] * operand[1];
                break;
            case 5:
                sum = operand[0] % operand[1];
                break;
            default:
                System.out.println("Masukan nomor antara 1 - 5");
                System.exit(0);
        }

        System.out.println(sum);


    }
}
