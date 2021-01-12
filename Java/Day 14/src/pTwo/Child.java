package pTwo;
import pOne.Parent;
public class Child extends Parent
{
    public void display()
    {
        super.display();
        System.out.println("Child in package pTWO");
    }
}

