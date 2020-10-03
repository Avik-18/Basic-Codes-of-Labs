package Day_4;
public class Static_Ordinary 
{    
    Static_Ordinary () 
    { 
        System.out.println("Then constructor invoked"); 
    } 
    static
    { 
        System.out.println("1st static called"); 
    }  
    { 
        System.out.println("Then instance block called"); 
    } 
    static
    { 
        System.out.println("Then 2nd static called"); 
    } 
    public static void main(String[] args) 
    { 
        Static_Ordinary ob=new Static_Ordinary();
    } 
} 
