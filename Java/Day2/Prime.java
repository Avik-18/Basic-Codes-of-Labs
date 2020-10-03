import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        int n1,n2,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit ");
        n1=sc.nextInt();     
        System.out.print("Enter the upper limit ");
        n2=sc.nextInt(); 
        System.out.print("Prime Numbers are : ");
        for(int i=n1;i<=n2;i++)
        {
            c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.print(i+", ");
            }
        }
    }
}