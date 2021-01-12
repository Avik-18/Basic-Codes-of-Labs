package Day10;
interface INTA
{
    void f1();
}
interface INTB
{
    void f1();
}
class Test implements INTA,INTB
{
    @Override
    public void f1()
    {
        System.out.println("No Error");
    }
}
public class Caller2
{
    public static void main(String args[])
    {
        Test ob=new Test();
        ob.f1();
    }
}
