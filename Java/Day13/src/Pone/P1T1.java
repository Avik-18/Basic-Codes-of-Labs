package Pone;
public class P1T1 
{
    public void f1()
    {
        System.out.println("Base Class f1 in Pone Package");
    }
}
class Child extends P1T1 
{
    @Override
    public void f1()
    {
        System.out.println("Derived Class f1 in Pone Package");
    }
}
class Caller1
{
    public static void main(String args[])
    {
        P1T1 obj;
        Child obj2;
        P1T1 ob=new P1T1();
        Child ob2=new Child();
        obj=ob;
        obj2=ob2;
        obj.f1();
        obj2.f1();
    }
}