package Day_4;
public class Constructor_Chaining
{
    Constructor_Chaining() 
    { 
        this(10); 
        System.out.println("The Default constructor"); 
    } 
    Constructor_Chaining(int x) 
    { 
        this(15, 25); 
        System.out.println(x); 
    } 
    Constructor_Chaining(int x, int y) 
    { 
        System.out.println(x+y); 
    } 
    public static void main(String args[]) 
    { 
        Constructor_Chaining ob=new Constructor_Chaining(); 
    }    
}
