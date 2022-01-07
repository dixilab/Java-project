/* *
 * 1.3.37. Random walker / Случайное блуждание на плоскости
 * */

public class RandomWalker
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        int x,y;
        x = n;
        y = n;
        while (x<=2*n-1 && y<=2*n-1 && x>=1 && y>=1)
        {
            double rnd = Math.random();
            if (rnd > 0.75) {y++; System.out.println("y go to North: "+y);}
            else if (rnd > 0.5) {y--; System.out.println("y go to South: "+y);}
            else if (rnd > 0.25) {x--; System.out.println("x go to West: "+x);}
            else {x++; System.out.println("x go to East: "+x);}
            sum++;
        }
        System.out.println("We get the end in "+sum+" step");
    }
}
