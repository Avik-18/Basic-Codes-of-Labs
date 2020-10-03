package Day6;
class A1
{
    void show()
    {
        System.out.println("Base Class");
    }
}
class B1 extends A1
{
    void show()
    {
        System.out.println("Class B1 and Derived class of class A1");
    }
}
class C1 extends A1
{
    void show()
    {
        System.out.println("Class C1 and Derived class of class A1");
    }
}
class D1 extends A1
{
    void show()
    {
        System.out.println("Class D1 and Derived class of class A1");
    }
}
class Caller2 
{
    public static void main(String args[])
    {

        A1 ob=new A1();
        A1 ob1=new B1();
        A1 ob2=new C1();
        A1 ob3=new D1();
        ob.show();
        ob1.show();
        ob2.show();
        ob3.show();
    }
    
}
