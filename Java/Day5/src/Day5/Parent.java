package Day5;
class Parent
{
    int id;
    String name,address;
    Parent()
    {
        name="Avik Ghosh";
        id=1039;
        address="Barrackpoe";
    }
    public void display()
    {
        System.out.println("Parent :");
        System.out.println("Name : "+name+"\tID : "+id+"\nAddress : "+address);
        System.out.println("----------------------------------------------");
    }
}
class ChildOne extends Parent
{
    int id,marks;
    String name,address;
    ChildOne()
    {
        name=super.name;
        id=super.id;
        address=super.address;
        marks=86;
    }
    @Override
    public void display()
    {
        System.out.println("Child One :");
        System.out.println("Name : "+name+"\tID : "+id+"\nAddress : "+address);
        System.out.println("Marks : "+marks);
        System.out.println("----------------------------------------------");
    }
}
class ChildTwo extends ChildOne
{
    int id,salary;
    String name,address,qualification;
    ChildTwo()
    {
        name=super.name;
        id=super.id;
        address=super.address;
        qualification="B.Tech";
        salary=450000;
    }
    @Override
    public void display()
    {
        System.out.println("Child Two :");
        System.out.println("Name : "+name+"\tID : "+id+"\nAddress : "+address);
        System.out.println("Qualification : "+qualification+"\nSalary : "+salary);
    }
}
class Caller5
{
    public static void main(String args[])
    {
        Parent ob=new Parent();
        ChildOne ob1=new ChildOne();
        ChildTwo ob2=new ChildTwo();
        ob.display();
        ob1.display();
        ob2.display();
    }
}