public class Recursy {

    public static void countdown(int num) {
        if (num < 0) {
            return;
        }
        System.out.print(num +  " ");
        countdown(num - 1);
    }

    public static int pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * pow(base, exp - 1);
    }
}
