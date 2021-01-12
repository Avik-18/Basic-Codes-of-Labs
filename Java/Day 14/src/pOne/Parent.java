package pOne;
import pTwo.Child;
public class Parent
{
    int var;
    public void display()
    {
        var=10;
        System.out.println("Parent in package pOne and value of x is "+var);
    }
}
class Caller1
{
    public static void main(String args[])
    {
        Child ob=new Child();
        ob.display();
    }
}
