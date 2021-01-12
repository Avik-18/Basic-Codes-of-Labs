package Day15;
class Outer 
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
    class Inner
    {    
        void innerMethod()
        { 
            System.out.println("inside innerMethod"); 
            System.out.println("\nCalling Outer Class method without object ");
            outerMethod();
        }  
    } 
} 
class Caller1
{ 
    public static void main(String[] args)
    { 
        Outer obj = new Outer(); 
        obj.call_inner_method(); 
    } 
} 