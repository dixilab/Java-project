/* *
 * 1.3.42. Monte Hall / Модель игры
 * */

public class MonteHall
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]); //trials
        int win1 = 0; //don't change the door
        int win2 = 0; //changes the door
        for (int i = 1; i <= n; i++)
        {
            int prize = (int) (3 * Math.random());
            int choice = (int) (3 * Math.random());
            int open;
            int change;
            do
            {
                open = (int) (3 * Math.random());
            } while (prize == open || choice == open);
            if (prize == choice) win1++;
            change = 1 + 2 - choice - open;
            if (prize == change) win2++;
        }
        System.out.println("Don't change the door: " + (1.0 * win1/n));
        System.out.println("Changes the door: " + (1.0 * win2/n));
    }
}
