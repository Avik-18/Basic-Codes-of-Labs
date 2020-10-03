package Day_4;
public class Ordinary 
{  
    Ordinary() 
    { 
        System.out.println("Constructor invoked"); 
    } 
    { 
        System.out.println("1st Ordinary Block Executed"); 
    } 
    { 
        System.out.println("2nd Ordinary Block Executed"); 
    } 
    public static void main(String[] args) 
    { 
        System.out.println("Ordinary block not executed as no object is been created till now");
        Ordinary ob=new Ordinary();
        System.out.println("\nAll the ordinary blocks get executed when object is created\nand also the blocks executed in sequential order in which they were created");
    } 
} 
