package unaryoperator;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        boolean benar = true;

        // unary operator adalah operator yang hanya memerlukan satu operand untuk bekerja
        // contoh operator adalah '!' '+' '-' dan operand 'true' '1' '2', dll

        // Minus & Plus Operand

        System.out.println(-x);
        System.out.println(+x);


        //Pre - increment
        // angkanya di tambahin sebelum dicetak

        System.out.println("Pre - Increment :");

        System.out.println("x awal : " + x);
        System.out.println("++x : " + ++x);
        System.out.println("setelah : " + x);

        //Post - increment
        // angkanya di cetak dulu sebelum ditambah

        x--;

        System.out.println("Post - Increment :");
        System.out.println("x awal : " + x);
        System.out.println("++x : " + x++);
        System.out.println("setelah : " + x);

        System.out.println("value variable !benar : " + !benar);
    }
}
