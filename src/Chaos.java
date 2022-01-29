/* *
 * 1.3.45. Chaos / Хаос
 * */

public class Chaos
{
    public static void main(String[] args)
    {
        double x = 0.01;
        double r = Double.parseDouble(args[0]);
        int t = 1;
        do {x = r*x*(1-x); System.out.print(t+" "); System.out.println(x); t++;}
        while (x != 1-1/r && x > 0 && x < 1);
    }
}
