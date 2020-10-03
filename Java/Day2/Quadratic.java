import java.io.*; 
import java.lang.*; 
import java.util.*;
class Quadratic 
{ 
  
    void findRoots(int a, int b, int c) 
    { 
         if (a == 0) 
         { 
            System.out.println("Invalid"); 
            return; 
         } 
         int d  = b*b - 4*a*c; 
         double sqrt_val = Math.sqrt(Math.abs(d)); 
         double x1,x2;
         if (d > 0) 
         { 
            System.out.println("Roots are real and different \n"); 
            x1=(double)(-b+sqrt_val)/(2*a); 
            x2= (double)(-b-sqrt_val)/(2*a);
            System.out.println(x1+"\n"+x2); 
         } 
         else if(d==0)
         {
             System.out.println("Roots are real and same \n"); 
             x1=(double)(-b) / (2 * a);
             System.out.println(x1); 
        }
         else 
         { 
            System.out.println("Roots are complex \n"); 
            System.out.println(-(double)b/(2*a)+"+i"+sqrt_val/(2*a)+"\n"+-(double)b/(2*a)+"- i"+sqrt_val/(2*a)); 
         } 
    }  
    public static void main(String args[]) 
    {
       int a,b,c; 
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a ");
       a=sc.nextInt();
       System.out.print("Enter b ");
       b=sc.nextInt();
       System.out.print("Enter c ");
       c=sc.nextInt();
       Quadratic ob = new Quadratic(); 
       ob.findRoots(a, b, c); 
    } 
} 