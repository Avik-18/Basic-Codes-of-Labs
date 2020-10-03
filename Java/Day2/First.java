public class First
{
    int n;
    First(int x)
    {
        n=x;
    }
    void show()
    {
        System.out.print("Value initialized in constructor is : "+n);
    }
    public static void main(String args[])
    {      
        First ob =new First(10);
        ob.show();        
    }
}