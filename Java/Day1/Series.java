import java.util.*;
public class Series
{
    public static void main(String args[])
    {
        int n;
        double sum=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range of series ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+(1.0/i);
        }
        System.out.printf("Sum = %.2f ",sum);
    }
}