import java.util.*;
public class Dec_to_Int
{
    public static void main(String args[])
    {
        double n,n1;
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number in decimal ");
        n=sc.nextDouble();        
        d=(int)n;
        System.out.print("The output in paise is : ");
        if((n-d)>0)
        {
            String a=Double.toString(n);
            int l=a.length();
            for(int i=0;i<l;i++)
            {
                char c=a.charAt(i);
                if(c!='.')
                {
                    System.out.print(c);
                }
            }
        }
        else
        {
            System.out.print(d);
        }
    }
}