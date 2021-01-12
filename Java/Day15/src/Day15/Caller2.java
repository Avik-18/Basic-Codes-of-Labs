package Day15;
private class Outer_2 
{ 
    void outerMethod()
    {         
        System.out.println("inside outerMethod");         
    }
    void call_inner_method()
    {
        System.out.println("Calling Inner Class method with object ");
        Inner ob = new Inner(); 
        ob.innerMethod();
    }
    private class Inner_2
    {    
        void innerMethod()
        { 
            System.out.println("inside innerMethod"); 
            System.out.println("\nCalling Outer Class method without object ");
            outerMethod();
        }  
    } 
} 
class Caller2
{ 
    public static void main(String[] args)
    { 
        Outer_2 obj = new Outer_2(); 
        obj.call_inner_method(); 
    } 
} 