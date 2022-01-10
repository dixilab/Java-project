/* *
 * 1.3.38. Exponential function / Экспоненциальная функция
 * */

public class Exp
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double sum = 0.0;
        double term = 1.0;
        for (int n = 1; sum != sum + term; n++)
        {
            sum += term;
            term *= x/n;
        }
        System.out.println("Math.exp("+x+"): "+Math.exp(x));
        System.out.println("My.exp("+x+"): "+sum);
    }
}
