package Day7;
abstract final class Shape
{
    abstract public void area();
}
class Circle extends Shape
{
    int r;
    double a;
    Circle()
    {
        r=5;
    }
    public void area()
    {
        a=4*3.14*(r*r);
    }
    public void display()
    {
        System.out.println("Area of Circle : "+a);
    }
}
class Rectangle extends Shape
{
    int l,b,a;
    Rectangle()
    {
        l=5;
        b=10;
    }
    public void area()
    {
        a=l*b;
    }
    public void display()
    {
        System.out.println("Area of Rectangle : "+a);
    }
}
class Caller6
{
    public static void main(String args[])
    {
        Circle ob=new Circle();
        ob.area();
        ob.display();
        Rectangle ob1=new Rectangle();
        ob1.area();
        ob1.display();
    }
}
