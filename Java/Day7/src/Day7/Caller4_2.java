package Day7;
class Test2_2
{
    static final int x;
    static void get()
    {
        x=10;
    }
    void display()
    {
        System.out.println("Value of x in base class : "+x);
    }
}
class Sub_Test2_2 extends Test2_2
{
    void display()
    {
        System.out.println("Called from Derived class");
        super.display();
    }
}
class Caller4_2
{
    public static void main(String args[])
    {
        Test2_2.get();
        Sub_Test2_2 ob=new Sub_Test2_2();
        ob.display();
    }
}
