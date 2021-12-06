package home_work_1;

public class Zad_1 {
    public static void main(String[] args) {
        // все побитовые операции с 42 и 15.
        int a = 42; // 00101010
        int b = 15; // 00001111
        int anot = ~a; // 11010101   -43
        int bnot = ~b; // 11110000    -16
        System.out.println(anot) ;
        System.out.println(bnot) ;

        int and = a & b; // 00001010    10
        System.out.println(and);


         a &= b; // тоже что и в предыдущем
        System.out.println(a);

        a = 42;
        int or = a | b; // 00101111    47
        System.out.println(or);


        a |= b; // смотри предыдущий
        System.out.println(a);

        a = 42;
        int xor = a^b; //00100101      37
        System.out.println(xor);

        a ^= b; // смотри предыдущий
        System.out.println(a);
        a = 42;

        int shift_r_a = a >> 2; // 00101010 >>2 = 00001010      10
        int shift_r_b = b >> 4; // 00001111 >>4 = 00000000       0
        System.out.println(shift_r_a);
        System.out.println(shift_r_b);

        a >>= b; // очень большой сдвиг - все по нулям
        System.out.println(a);

        a=42;
        int shift_l_a = a << 2; // 00101010 << 2 = 1010_1000      168
        int shift_l_b = b << 22; // 00001111 << 22 = 0011_1100_0000_0000_0000_0000_0000         62_914_560
        System.out.println(shift_l_a);
        System.out.println(shift_l_b);

        a <<= b;
        System.out.println(a); //  00101010 << 15 = 0001_0101_0000_0000_0000_0000          1_376_256
        a = 42;


        int shift_rr_a = a >>> 2; // 00101010 >>2 = 00001010          10
        int shift_rr_b = b >>> 4; // 00001111 >>4 = 00000000              0
        System.out.println(shift_rr_a);
        System.out.println(shift_rr_b);

        a >>>=b; //00101010 >>> 15 = 00000000            0
        System.out.println(a);

        // все побитовые операции с -42 и -15

        System.out.println("Вот отсюда операции с отрицательными числами");







        int z = -42; // 1101_0110
        int x = -15; // 1111_0001
        int znot = ~z; // 00101001        41
        int xnot = ~x; // 00001110        14
        System.out.println(znot) ;
        System.out.println(xnot) ;

        int zand = z & x; // 1101-0000           -48
        System.out.println(zand);


        z &= x; // тоже что и в предыдущем
        System.out.println(z);

        z = -42;
        int zor = z | x; // 1111-0111           -9
        System.out.println(zor);


        z |= x; // смотри предыдущий
        System.out.println(z);

        z = -42;
        int zxor = z^x; //00100111           39
        System.out.println(zxor);

        z ^= x; // смотри предыдущий
        System.out.println(z);

        z = -42;

        int shift_r_z = z >> 2; // 1101_0110 >>2 = 1111_0101              -11
        int shift_r_x = x >> 4; // 1111_0001 >>4 = 1111_1111               -1
        System.out.println(shift_r_z);
        System.out.println(shift_r_x);

        z >>= x; // все в еденичках так как восстанавливается значение старшего бита            -1
        System.out.println(z);

        z = -42;
        int shift_l_z = z << 2; // 1101_0110 << 2 = 0101_1000   -168
        int shift_l_x = x << 22; // 1111_1111_1111_1111_1111_1111_1111_0001 << 22 = 1111_1100_0100_0000_0000_0000_0000_0000   -62_914_560
        System.out.println(shift_l_z);
        System.out.println(shift_l_x);

        z <<= -x;
        System.out.println(z); //  сдвиг на отрицательное число?? тарабарщина какаято получается
        z = -42;


        int shift_rr_z = z >>> 2; // 1111_1111_1111_1111_1111_1111_1101_0110 >>2 = 0011_1111_1111_1111_1111_1111_1111_0101    1_073_741_813
        int shift_rr_x = x >>> 4; // 1111_1111_1111_1111_1111_1111_1111_0001 >>4 = 0000_1111_1111_1111_1111_1111_1111_1111       268_435_455
        System.out.println(shift_rr_z);
        System.out.println(shift_rr_x);

        z >>>=x; //00101010 >>> 15 = 0000_0000_0000_0001_1111_1111_1111_1111              32_767
        System.out.println(z);


       /* double f = 42.5; // ломается программа, говорит что не применяются бинарные операторы к даблу.
        double h = ~f;
        System.out.println(h);
*/

















    }
}
