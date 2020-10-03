package Day5;
class Reference
{
    public void display()
    {
        System.out.println("Base Class of Reference1");
    }
}
class Reference1 extends Reference
{
    @Override
    public void display()
    {
        System.out.println("Base Class of Reference2");
    }
}
class Reference2 extends Reference1
{
    @Override
    public void display()
    {
        System.out.println("Derived Class");
    }
}
class Caller2
{
    public static void main(String args[])
    {
        Reference x;
        Reference1 y;
        Reference2 z;
        Reference ob=new Reference();
        Reference1 ob1=new Reference1();
        Reference2 ob2=new Reference2();
        x=ob;
        y=ob1;
        z=ob2;
        x.display();
        y.display();
        z.display();
    }
}   
