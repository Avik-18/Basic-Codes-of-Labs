package Day7;
class Test
{
    final int x=10;
    void display()
    {
        System.out.println("Value of x in base class : "+x);
    }
}
class Sub_Test extends Test
{
    void display()
    {
        super.display();
    }
}
class Caller3
{
    public static void main(String args[])
    {
        Sub_Test ob=new Sub_Test();
        ob.display();
    }
}
