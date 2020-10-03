package Day6;
abstract class Shape
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
        a=(4.0*3.14)*(r*r);
        System.out.println("Area of circle : "+a);
    }
}
class Rectangle extends Shape
{
    int l,b;
    double a;
    Rectangle()
    {
        l=5;
        b=10;
    }
    public void area()
    {
        a=l*b;
        System.out.println("Area of rectangle : "+a);
    }
}
class Caller5
{
    public static void main(String args[])
    {
        Shape ob=new Circle();
        ob.area();
        Shape ob1=new Rectangle();
        ob1.area();
    }    
}
