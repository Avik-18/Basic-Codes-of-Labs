package Day9;
abstract class A
{
    int x;
    abstract static void display();
}
class B extends A
{
    static void display()
    {
        System.out.println("In Sub class");
    }
}
class caller2
{
    public static void main(String args[])
    {
        B ob=new B();
        ob.display();
    }
}