package Day7;
class Test3_2
{
    final int x;
    Test3_2()
    {
        x=10;
    }
    void display()
    {
        System.out.println("Value of x in base class : "+x);
    }
}
class Sub_Test3_2 extends Test3_2
{
    void display()
    {
        System.out.println("Called from Derived class");
        super.display();
    }
}
class Caller3_2
{
    public static void main(String args[])
    {
        Test3_2 ob=new Test3_2();
        Sub_Test3_2 ob1=new Sub_Test3_2();
        ob1.display();
    }
}
