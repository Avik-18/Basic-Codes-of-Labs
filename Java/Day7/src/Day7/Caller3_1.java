package Day7;
class Test3_1
{
    final int x;
    {
        x=10;
    }
    void display()
    {
        System.out.println("Value of x in base class : "+x);
    }
}
class Sub_Test3_1 extends Test3_1
{
    void display()
    {
        System.out.println("Called from Derived class");
        super.display();
    }
}
class Caller3_1
{
    public static void main(String args[])
    {
        Test3_1 ob=new Test3_1();
        Sub_Test3_1 ob1=new Sub_Test3_1();
        ob1.display();
    }
}
