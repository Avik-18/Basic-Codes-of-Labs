public class Factorial
{
    public int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        Factorial ob=new Factorial();
        int result=ob.fact(n);
        System.out.println("Factorial of "+n+" is : "+result);
    }
}