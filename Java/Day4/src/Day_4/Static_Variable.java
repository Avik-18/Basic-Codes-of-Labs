package Day_4;
public class Static_Variable 
{
    static int c=5;
    Static_Variable() 
    { 
        c=c+1; 
    } 
    void display()
    {
        System.out.println("Value of static variable : "+c);
        c=c+2;
    }
    public static void main(String[] args) 
    {
        System.out.println("Initial value of c : "+c);
        System.out.println("Value of c after 1st contsructor called");
        Static_Variable ob=new Static_Variable();
        ob.display();
        System.out.println("Value of c after 2nd contsructor called");
        Static_Variable ob1=new Static_Variable();
        ob1.display();
    }   
}
