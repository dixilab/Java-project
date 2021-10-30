/* *
 * 1.2.35. Dragon curve / Кривая дракона
 * */

public class DragonCurve
{
    public static void main(String[] args)
    {
        String d0, d1, d2, d3, d4; // for L
        String b0, b1, b2, b3; // for R
        d0 = "F";
        b0 = "F";
        d1 = d0 + "L" + b0;
        b1 = d0 + "R" + b0;
        d2 = d1 + "L" + b1;
        b2 = d1 + "R" + b1;
        d3 = d2 + "L" + b2;
        b3 = d2 + "R" + b2;
        d4 = d3 + "L" + b3;
        System.out.println("1: " + d0);
        System.out.println("2: " + d1);
        System.out.println("3: " + d2);
        System.out.println("4: " + d3);
        System.out.println("5: " + d4);
    }
}
