/* *
 * 1.2.25. Wind chill / Охлаждение под действием ветра
 * */

public class WindChill
{
    public static void main(String[] args)
    {
        double temperature, velocity, windchill;
        temperature = Double.parseDouble(args[0]);
        velocity = Double.parseDouble(args[1]);
        windchill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);
        boolean v;
        v = (temperature <= 50) && (120 >= velocity) && (velocity >= 3);
        System.out.println(windchill);
        System.out.println("result: " + v);
        System.out.println("(if false - not correct, if true - correct)");
        System.out.println("temperature <= 50, 3 <= velocity <= 120");
    }
}
