/* *
 * 1.2.34. Sorting triplets / Сортировка троек
 * */

public class SortingTriplets
{
    public static void main(String[] args)
    {
        int a, b, c, min, mean, max;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        min = Math.min(Math.min(a, b), c);
        max = Math.max(Math.max(a, b), c);
        mean = (a + b + c) - (min + max);
        System.out.println(min + " " + mean + " " + max);
    }
}
