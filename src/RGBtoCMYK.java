/* *
 * 1.2.32. RGB to CMYK / Преобразование цветов
 * */

public class RGBtoCMYK
{
    public static void main(String[] args)
    {
        double r, g, b;
        r = Double.parseDouble(args[0]);
        g = Double.parseDouble(args[1]);
        b = Double.parseDouble(args[2]);
        double w, c, m ,y, k;
        w = Math.max( r / 255, Math.max(g / 255, b / 255));
        c = Math.round((( w - ( r / 255 )) / w )* 100 ) / 100.0;
        m = Math.round((( w - ( g / 255 )) / w )* 100 ) / 100.0;
        y = Math.round((( w - ( b / 255 )) / w )* 100 ) / 100.0;
        k = Math.round(( 1 - w ) * 100) / 100.0;
        System.out.println("C: " + c);
        System.out.println("M: " + m);
        System.out.println("Y: " + y);
        System.out.println("K: " + k);
    }
}
