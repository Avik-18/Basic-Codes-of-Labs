package Day6;
abstract class First
{
    void show()
    {
        System.out.println("Base Class");
    }
}
class Second extends First
{
    void show()
    {
        System.out.println("Derived class");
    }
}
class Caller3 
{
    public static void main(String args[])
    {
        First ob=new Second();
        ob.show();
    }
    
}
