public class Instance
{
    int n;
    Instance(int x)
    {
        n=x;
        System.out.println("Constructor called through another class");
    }
    void show()
    {        
        System.out.println("Value initialized in constructor is : "+n);
    }
}
