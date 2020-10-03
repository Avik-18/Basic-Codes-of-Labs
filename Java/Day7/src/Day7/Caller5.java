package Day7;
final class Test1
{
    void display()
    {
        System.out.println("Base class");
    }
}
class Sub_Test1 extends Test1
{
    void display()
    {
        System.out.println("Called from Derived class");
        super.display();
        System.out.println("Back in Derived class");
    }
}
class Caller5
{
    public static void main(String args[])
    {
        Test1 ob=new Test1();
        Sub_Test1 ob2=new Sub_Test1();
        ob.display();
        ob2.display();
    }
}
