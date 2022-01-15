/* *
 * 1.3.39. Trigonometric functions / Тригонометрические функции
 * */

public class Sin
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args [0]);
        x = x % (2 * Math.PI); //angle between -2 PI and 2 PI
        double sum = 0.0;
        double term = x;
        for (int i = 1; sum != sum+term; i++)
        {
            sum += term;
            term *= (-1) * (x*x / ((i*2)*(i*2+1)));
        }
        System.out.println("Math.sin: "+Math.sin(x));
        System.out.println("My.sin: "+sum);
    }
}
