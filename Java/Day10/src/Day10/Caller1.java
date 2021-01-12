package Day10;
interface Shape
{
    final double pie=3.14;
}
class Circle implements Shape
{
    int radius;
    double area;
    Circle(int r)
    {
        radius=r;
    }
    public void display()
    {
        area=pie*(radius*radius);
        System.out.println("Area of Circle = "+area);
    }
}
class Rectangle implements Shape
{
    int length,breadth;
    double area;
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public void display()
    {
        area=length*breadth;
        System.out.println("Area of Rectangle = "+area);
    }
}
public class Caller1
{
    public static void main(String args[])
    {
        Circle ob=new Circle(5);
        ob.display();
        
        Rectangle ob1=new Rectangle(10,20);
        ob1.display();
    }
}
