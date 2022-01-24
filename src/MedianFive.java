/* *
 * 1.3.43. Median of 5 numbers / Медиана 5 чисел
 * */

public class MedianFive
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int t = 0;
        // sorting a, b, c (first three numbers)
        if (a > b) {t = a; a = b; b = t;}
        if (a > c) {t = a; a = c; c = t;}
        if (b > c) {t = b; b = c; c = t;}
        // find median t
        if (d < a && e < a) {t = a;}
        else if (d > c && e > c) {t = c;}
        else if (d < b && e < b) {t = Math.max(d, e);}
        else if (d > b && e > b) {t = Math.min(d, e);}
        System.out.print(t);
    }
}
