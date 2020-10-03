package Day5;
class Constructor
{
    Constructor()
    {
        System.out.println("When object of derived class is created then\nalso, constructor of the base class is called first.");
        System.out.println("Base Class of Derive_Constructor");
    }
}
class Derive_Constructor extends Constructor
{
    Derive_Constructor()
    {
        System.out.println("Then Derived class Constructor is called.");
    }
}
class Caller4
{
    public static void main(String args[])
    {
        Derive_Constructor ob=new Derive_Constructor();
    }
}