package Day6;
abstract class Parent
{
    void show()
    {
        System.out.println("Show Method of Parent");
    }
}
class Child extends Parent
{
    void show()
    {
        System.out.println("Show Method of Child");
    }
}
class Caller6
{
    public static void main(String args[])
    {
        Parent ob=new Child(); //Upcasting
        ob.show();
        Child ob1=(Child)ob;  //Downcasting
        ob1.show();
    }
}
