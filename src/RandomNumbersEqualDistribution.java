public class RandomNumbersEqualDistribution
{
    public static void main(String[] args)
    {
        double x1, x2, x3, x4, x5, av, mn0, mn1, mn2, mn3, mx0, mx1, mx2, mx3;
        x1 = Math.random();
        x2 = Math.random();
        x3 = Math.random();
        x4 = Math.random();
        x5 = Math.random();
        av = (x1+x2+x3+x4+x5)/5;
        mn0 = Math.min(x1,x2);
        mn1 = Math.min(x3,x4);
        mn2 = Math.min(mn0,mn1);
        mn3 = Math.min(mn2,x5);
        mx0 = Math.max(x1,x2);
        mx1 = Math.max(x3,x4);
        mx2 = Math.max(mx0,mx1);
        mx3 = Math.max(mx2,x5);
        System.out.println("Random numbers:"+x1+", "+x2+", "+x3+", "+x4+", "+x5);
        System.out.println("Average:"+av);
        System.out.println("Min: "+mn3);
        System.out.println("Max: "+mx3);
    }
}
