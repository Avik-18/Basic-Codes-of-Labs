package Day10;
interface INTA_1
{
    default public void f1()
    {
        System.out.println("INTA");
    }
}
interface INTB_2
{
    default public void f1()
    {
        System.out.println("INTB");
    }
}
class Test_1 implements INTA_1,INTB_2
{
    Test_1()
    {
        System.out.println("Constructor Called");
    }
}
public class Caller4 
{
    public static void main(String args[])
    {
        Test_1 ob=new Test_1();
        ob.f1();
    }
}
