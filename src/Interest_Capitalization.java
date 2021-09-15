/* *
* 1.2.24. Interest capitalization/Капитализация процентов
* My first program on github :)
* */

public class Interest_Capitalization
{
    public static void main(String[] args)
    {
        double p, r, t, a;
        p = Double.parseDouble(args[0]);
        r = Double.parseDouble(args[1])/100;
        t = Double.parseDouble(args[2]);
        a = p*Math.pow(Math.E,r*t);
        System.out.println(a);
    }
}
