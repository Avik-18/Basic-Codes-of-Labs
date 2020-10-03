import java.util.*;
public class Fibonacci
{
    public int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            return (fib(n-1)+fib(n-2));
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth term ");
        n=sc.nextInt();
        Fibonacci ob=new Fibonacci();
        System.out.println("FIBONACCI SERIES");
        for(int i=0;i<n;i++)
        {
            int result=ob.fib(i);
            System.out.print(result+", ");
        }
    }
}