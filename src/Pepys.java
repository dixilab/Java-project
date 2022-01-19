/* *
 * 1.3.41. Newton-Pepys problem / Задача Пеписа
 * */

public class Pepys
{
    public static void main(String[] args)
    {
        double test = Double.parseDouble(args[0]); //how many tests should be done?
        int n = 1;
        int p = 1;
        int o = 1;
        for (int k = 1; k <= test; k++)
        {
            int roll1 = 6;
            int lim1 = 1;

            double sum = 0;
            for (int i = 1; i <= roll1; i++)
            {
                double rnd = (int) (0+Math.random()*6);
                if (rnd == n) sum++;
            }
            if (sum >= lim1) p++;
        }
        for (int k = 1; k <= test; k++)
        {
            int roll2 = 12;
            int lim2 = 2;

            double sum = 0;
            for (int i = 1; i <= roll2; i++)
            {
                double rnd = (int) (0+Math.random()*6);
                if (rnd == n) sum++;
            }
            if (sum >= lim2) o++;
        }
        System.out.println("Probability of getting a 1 at least once with a roll of 6 dice");
        System.out.println(p/test);
        System.out.println();
        System.out.println("Probability of getting a 1 at least twice with a roll of 12 dice");
        System.out.println(o/test);
    }
}
