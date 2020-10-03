package Day6;
class A
{
    void show()
    {
        System.out.println("Base Class");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Class B and Derived class of class A");
    }
}
class C extends A
{
    void show()
    {
        System.out.println("Class C and Derived class of class A");
    }
}
class D extends A
{
    void show()
    {
        System.out.println("Class D and Derived class of class A");
    }
}
class Caller1 
{
    public static void main(String args[])
    {
        A ob;
        B ob1;
        C ob2;
        D ob3;
        A obj=new A();
        B obj1=new B();
        C obj2=new C();
        D obj3=new D();
        ob=obj;
        ob1=obj1;
        ob2=obj2;
        ob3=obj3;
        ob.show();
        ob1.show();
        ob2.show();
        ob3.show();
    }    
}
