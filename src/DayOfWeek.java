/* *
 * 1.2.29. Day of the week / День недели
 * */

public class DayOfWeek
{
    public static void main(String[] args)
    {
        int y, m, d;
        m = Integer.parseInt(args[0]);
        d = Integer.parseInt(args[1]);
        y = Integer.parseInt(args[2]);
        int y0, x, m0, d0;
        y0 = y - (14 - m) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x +(31 * m0) / 12) % 7;
        System.out.println(d0);
    }
}
