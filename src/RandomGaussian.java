/* *
 * 1.2.27. Random Gaussian / Случайные числа с гауссовским (нормальным) распределением
 * */

public class RandomGaussian
{
    public static void main(String[] args)
    {
        double r, v , u;
        v = Math.random();
        u = Math.random();
        r = Math.sin(2*Math.PI*v)*Math.sqrt((-2*Math.log(u)));
        // or r = Math.sin(2*Math.PI*v)*Math.pow((-2*Math.log(u)),1.0/2.0);
        System.out.println(r);
    }
}
