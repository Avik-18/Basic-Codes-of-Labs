package p1;
import p1.p2.*;
import p1.p2.p3.*;
interface I1
{
    void f1();
}

class A implements I1
{
    public void f1()
    {
            System.out.println("Function of I1 in package p1");
    }
}

public class Caller3
{
   public static void main(String args[])
   {
       A ob=new A();
       ob.f1();
       
       SubClass1 ob1=new SubClass1();
       ob1.f2();
       
       SubClass2 ob2=new SubClass2();
       ob2.f3();
   }
}