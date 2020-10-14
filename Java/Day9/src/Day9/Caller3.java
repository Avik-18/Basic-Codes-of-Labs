package Day9;
class A2
{
    void display()
    {
        System.out.println("Base static");
    }
}
class B2 extends A2
{
    static void display()
    {
        System.out.println("Derived static");
    }
}
class caller3
{
    public static void main(String args[])
    {
        B2 ob=new B2();
        B2.display();
    }
}