/* *
 * 1.2.26. Polar coordinates / Полярные координаты
 * */

public class PolarCoordinates
{
    public static void main(String[] args)
    {
        double x, y, r, o;
        x = Double.parseDouble(args[0]);
        y = Double.parseDouble(args[1]);
        r = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        r = Math.round(r * 100.0 ) / 100.0;
        o = Math.toDegrees(Math.atan2(y,x));
        o = Math.round(o * 100.0 ) / 100.0;
        System.out.print("Polar coordinates: (" + r + ", " + o + ").");
    }
}
