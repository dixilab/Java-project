/* *
 * 1.3.36. Prime Counter / Подсчет простых чисел
 * */

// 79 second for n = 10000000

public class PrimeCounter
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for (int i = n; i>0; i--)
        {
            int factor;
            for (factor = 2; factor <= i/factor; factor++)
                if (i % factor == 0) break;
            if (i == 1) break;
            if (factor > i/factor) System.out.println(i);
        }
    }
}
