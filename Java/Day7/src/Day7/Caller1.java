package Day7;
class A
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
class B extends A
{
    int x=20;
    void show()
    {
        System.out.println("Derived Class Method");
    }
    void var()
    {
        System.out.println("Value of x in derived class : "+x);
    }
}
class Caller1
{
    public static void main(String args[])
    {
        A ob;
        B ob2;
        A obj=new A();
        B obj2=new B();
        ob=obj;
        ob2=obj2;
        ob.var();
        ob.display();
        ob2.var();
        ob2.show();
    }
}
