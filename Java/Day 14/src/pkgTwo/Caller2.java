package pkgTwo;
import pkgOne.*;
public class Caller2 implements Interface
{
    public void f1()
    {
        System.out.println("F1");
    }
    public void f2()
    {
        System.out.println("F2");
    }
    public void f3()
    {
        System.out.println("F3");
    }
    public static void main(String args[])
    {
        Caller2 ob1=new Caller2();
        ob1.f1();
        ob1.f2();
        ob1.f3(); 
    }
}