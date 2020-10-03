/*
package Day6;
abstract class One
{
    abstract void get();
    abstract void add();
    abstract void show();
}
class Two extends One
{
    int n1,n2,sum;
    Two()
    {
        n1=5;
        n2=15;
    }
    void add()
    {
        sum=n1+n2;
    }
    void show()
    {
        System.out.println("Derived class");
        System.out.println("Sum of "+n1+" + "+n2+" is : "+sum);
    }
}
class Caller4 
{
    public static void main(String args[])
    {
        Two ob=new Two();
        ob.show();
    }    
}
It cannot be compiled because as the class one is abstract hence
if we do not take all the abstract method in derived class hence it
cannot be compiled and if we make the derived class as abstract class
then it is possible to not override all the methods but then the object
of derived class cannot be created.
*/


