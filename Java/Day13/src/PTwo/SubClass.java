package PTwo;
import Pone.P1T1;
class SubClass extends P1T1 
{
    @Override
    public void f1()
    {
        System.out.println("Derived Class f1 in PTwo Package");
    }
}
class Caller2
{
    public static void main(String args[])
    {
        P1T1 obj;
        SubClass obj2;
        P1T1 ob=new P1T1();
        SubClass ob2=new SubClass();
        obj=ob;
        obj2=ob2;
        obj.f1();
        obj2.f1();
    }
}
