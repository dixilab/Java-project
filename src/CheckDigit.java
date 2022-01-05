/* *
 * 1.3.35. Check Digit ISBN / Контрольная сумма
 * */

public class CheckDigit
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 2; i<=10; i++)
        {
            int check = n % 10 * i;
            sum = sum + check;
            n = n / 10;
        }
        int cd = 11-(sum % 11);
        if (cd == 10) System.out.println("ISBN: "+args[0]+"-"+"X");
        else if (cd == 11) System.out.println("ISBN: "+args[0]+"-"+0);
        else System.out.println("ISBN: "+args[0]+"-"+cd);
    }
}
