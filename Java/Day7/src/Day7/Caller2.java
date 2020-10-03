package Day7;
class A1
{
    int x=10;
    final void display()
    {
        System.out.println("Base Class Method.");
    }
    void var()
    {
        System.out.println("Value of x in base class : "+x);
    }
}
class B1 extends A1
{
    int x=20;
    void display()
    {
        System.out.println("Derived Class Method");
    }
    void var()
    {
        System.out.println("Value of x in derived class : "+x);
    }
}
class Caller2
{
    public static void main(String args[])
    {
        A1 ob;
        B1 ob2;
        A1 obj=new A1();
        B1 obj2=new B1();
        ob=obj;
        ob2=obj2;
        ob.var();
        ob.display();
        ob2.var();
        ob2.show();
    }
}
