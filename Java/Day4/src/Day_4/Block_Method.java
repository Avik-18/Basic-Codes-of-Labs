package Day_4;
public class Block_Method 
{   
    Block_Method() 
    { 
        System.out.println("Default Constructor invoked"); 
    } 
    static
    { 
        System.out.println("Static block is executed 1st"); 
    }
    static void show()
    {
        System.out.println("Static method executed only when it was called");
    }
    public static void main(String[] args) 
    { 
        Block_Method ob=new Block_Method();
        show();
    }     
}
