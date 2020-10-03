package Day5;
class Static_Non_Static
{
    Static_Non_Static()
    {
        System.out.println("\nBase Class of Derive_Constructor");
    }
    {
        System.out.println("Non Static Block of Base Class");
    }
    static
    {
        System.out.println("Static Block of Base Class");
    }
}
class Derive_Static_Non_Static extends Static_Non_Static
{
    Derive_Static_Non_Static()
    {
        System.out.println("\nDerived class Constructor is called.");
    }
    {
        System.out.println("Non Static Block of Derived Class");
    }
    static
    {
        System.out.println("Static Block of Derived Class");
    }
}
class Caller6
{
    public static void main(String args[])
    {
        System.out.println("When only Creating Derived Class Object : ");
        Derive_Static_Non_Static ob=new Derive_Static_Non_Static();
    } 
}
