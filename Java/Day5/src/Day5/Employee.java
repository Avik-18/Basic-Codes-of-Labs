package Day5;
class Employee 
{
    String name;
    int id;
    Employee(String s,int n)
    {
        name=s;
        id=n;
    }
    public void display()
    {
        System.out.println("Base Class of Scientist");
    }
}
class Scientist extends Employee 
{
    int no_of_publication,experience;
    Scientist(int nfp,int exp)
    {
        super("Avik Ghosh",1039);
        no_of_publication=nfp;
        experience=exp;
    }
    public void display()
    {
        System.out.println("Base Class of DScientist");
    }
}
class DScientist extends Scientist
{
    String award;
    DScientist(String aw)
    {
        super(5,10);
        award=aw;
    }
    public void display()
    {
        System.out.println("Derived Class\n-------------------------------------------------------");
        System.out.println("Name : "+name+"\tID : "+id+"\nNo of Publication : "+no_of_publication+"\tExperience : "+experience);
        System.out.println("Award : "+award);
    }
}
class Caller1
{
    public static void main(String args[])
    {
        Employee ob=new Employee("Avik Ghosh",1039);
        Scientist ob1=new Scientist(5,10);
        DScientist ob2=new DScientist("Best Scientist");
        ob.display();
        ob1.display();
        ob2.display();
    }
}