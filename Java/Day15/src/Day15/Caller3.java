package Day15;
class O1
{
    void f1()
    {
        System.out.println("f1 method of O1 class");
        class Inn1
        {
            void inF1()
            {
                System.out.println("inF1 method of Inn1 class");
                class Inn2
                {
                    private int x;
                }
                Inn2 ob2=new Inn2();
                ob2.x=10;
                System.out.println("Value of x in Inn2 class"+ob2.x);
            }
           
        }
        Inn1 ob1=new Inn1();
        ob1.inF1();
    }
   
}
public class Caller3
{
    public static void main(String args[])
    {
        O1 ob=new O1();
        ob.f1();
    }
}
