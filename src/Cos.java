/* *
 * 1.3.39. Trigonometric functions / Тригонометрические функции
 * */

public class Cos
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args [0]);
        x = x % (2 * Math.PI); //angle between -2 PI and 2 PI
        double sum = 0.0;
        double term = 1.0;
        for (int i = 1; sum != sum+term; i += 2)
        {
            sum += term;
            term *= (-1) * (x*x / (i*(i+1)));
        }
        System.out.println("Math.cos: "+Math.cos(x));
        System.out.println("My.cos: "+sum);
    }
}
