package Day7;
class Test1_1
{
    static final int x=10;
    void display()
    {
        System.out.println("Value of x in base class : "+x);
    }
}
class Sub_Test1_1 extends Test1_1
{
    void display()
    {
        super.display();
    }
}
class Caller4
{
    public static void main(String args[])
    {
        Sub_Test1_1 ob=new Sub_Test1_1();
        ob.display();
    }
}
