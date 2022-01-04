/* *
 * 1.3.34. Ramanujan / Такси Рамануджана
 * */

public class Ramanujan
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for (int a = 0; a*a*a <= n; a++)
        {
            for (int b = 0; b*b*b <= n; b++)
            {
                for (int c = 0; c*c*c <= n; c++)
                {
                    for (int d = 0; d*d*d <= n; d++)
                    {
                        if (!((a==c && b==d) || (a==d && b==c)))
                            if (((a*a*a+b*b*b) == (c*c*c+d*d*d)) && (Math.abs(a*a*a+b*b*b) <= n))
                                System.out.println((a*a*a + b*b*b)+" = "+a+"^3 + "+b+"^3 = "+c+"^3 + "+d+"^3");
                    }
                }
            }
        }
    }
}
