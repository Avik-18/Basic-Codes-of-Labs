import java.util.*;
public class Series_2
{
    public static void main(String args[])
    {
        int n,sum=0,x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range of series ");
        n=sc.nextInt();
        System.out.print("Enter the value ");
        x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sum=sum+(int)Math.pow(x,i);
        }
        System.out.println("Sum = "+sum);
    }
}