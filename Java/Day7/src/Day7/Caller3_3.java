package Day7;
class Test3_3
{
    final int x;
    Test3_3()
    {
        x=10;
    }
    Test3_3(int n)
    {
        System.out.println("Value of n : "+n);
    }
    void display()
    {
        System.out.println("Value of x in base class : "+x);
    }
}
class Sub_Test3_3 extends Test3_3
{
    Sub_Test3_3()
    {
        super(20);
    }
    void display()
    {
        System.out.println("Called from Derived class");
        super.display();
    }
}
class Caller3_3
{
    public static void main(String args[])
    {
        Test3_3 ob=new Test3_3();
        Sub_Test3_3 ob1=new Sub_Test3_3();
        ob1.display();
    }
}
