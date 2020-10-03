import java.util.*;
public class GCD
{
    public int gcd(int n1,int n2)
    {
        if(n1==0)
        {
            return n1;
        }
        if(n2==0)
        {
            return n2;
        }
        if(n1==n2)
        {
            return n1;
        }
        if(n1>n2)
        {
            return gcd(n1-n2,n2);
        }
        else
        {
            return gcd(n1,n2-n1);
        }
    }
    public static void main(String args[])
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number ");
        n1=sc.nextInt();  
        System.out.print("Enter the second number ");
        n2=sc.nextInt();
        GCD ob=new GCD();
        System.out.println("GCD of "+n1+" & "+n2+" is : "+ob.gcd(n1,n2));        
    }
}