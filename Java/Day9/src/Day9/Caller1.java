
package Day9;
public class Caller1
{
    int x;
    final Caller1()
    {
        x=10;
        System.out.println("Value of x : "+x);
    }
    public static void main(String args[])
    {
        Caller1 ob=new Caller1();
    }
}
