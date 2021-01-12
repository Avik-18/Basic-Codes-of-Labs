package Day10;
interface A
{
    void f1();
    void f2();
}
interface B
{
    void f3();
    void f4();
}
interface C extends A,B
{
    void f5();
}
class D 
{
    public void f6()
    {
        System.out.println("In Class D");
    }
}
class Child extends D implements C
{
    public void f1()
    {
        System.out.println("f1");
    }
    public void f2()
    {
        System.out.println("f2");
    }
    public void f3()
    {
        System.out.println("f3");
    }
    public void f4()
    {
        System.out.println("f4");
    }
    public void f5()
    {
        System.out.println("f5");
    }
    public void f6()
    {
        super.f6();
        System.out.println("f6");
    }
}
public class Caller3
{
    public static void main(String args[])
    {
        Child ob=new Child();
        ob.f1();
        ob.f2();
        ob.f3();
        ob.f4();
        ob.f5();
        ob.f6();
    }
}
