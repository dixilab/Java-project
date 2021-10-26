/* *
 * 1.2.31. Mercator projection / Проекция Меркатора
 * */

public class MercatorProjection
{
    public static void main (String[] args)
    {
        double l0, l, f;
        l0 = Math.toRadians(Double.parseDouble(args[0]));
        l = Math.toRadians(Double.parseDouble(args[1]));
        f = Math.toRadians(Double.parseDouble(args[2]));
        double x, y, r;
        r = 6378000; //radius of the Earth
        x = r * (l - l0);
        y = r * ((0.5)*Math.log((1+Math.sin(f))/(1-Math.sin(f))));
        System.out.println("X:"+x+" Y:"+y);
    }
}
