public class CustomMath {
    public static final double PI = 3.14;
    public static final double E = 2.718;
    // these var are safe to be made public as they are static and final,
    // essentially making them constants in the code.

    public static int max(int a, int b) {

        int largest = 0;

        if (a > b) {largest = a;}
        if (b > a) {largest = b;}
        if (a == b) {largest = a;}

        return largest;
    }

    public static double max(double a, double b) {

        double largest = 0;

        if (a > b) {largest = a;}
        if (b > a) {largest = b;}
        if (a == b) {largest = a;}

        return largest;
    }

    public static int pow(int base, int exponent) {
        int power = 0;
        for (int x = 0; x < exponent; x++) {
            power = power * power;
        }
        return power;
    }


}
