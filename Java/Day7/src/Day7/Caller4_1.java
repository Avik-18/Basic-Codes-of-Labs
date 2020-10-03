package Day7;
class Test2_1
{
    static final int x;
    static
    {
        x=10;
    }
    void display()
    {
        System.out.println("Value of x in base class : "+x);
    }
}
class Sub_Test2_1 extends Test2_1
{
    void display()
    {
        System.out.println("Called from Derived class");
        super.display();
    }
}
class Caller4_1
{
    public static void main(String args[])
    {
        Sub_Test2_1 ob=new Sub_Test2_1();
        ob.display();
    }
}
