import java.util.*;
public class Temperature
{
    public static void main(String args[])
    {
        double c,f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit ");
        f=sc.nextDouble();
        c=(f-32.0)/1.8;
        System.out.println("Temperatur in Celcius : "+c);
    }
}