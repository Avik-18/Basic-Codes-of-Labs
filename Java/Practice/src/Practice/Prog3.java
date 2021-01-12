package Practice;
public class Prog3
{
    public static void main(String args[])
    {
        int num=152,D=5,f=0,i;
        for(i=num-1;i>=0;i--)
        {
            int num2=i;
            while(num2>0)
            {
                int a=num2%10;
                if(a!=D)
                {
                    f=1;
                    num2=num2/10;                
                }
                else
                {
                    f=0;
                    break;
                }
            }
            if(f==1)
            {
                break;
            }
        }
        System.out.println("The largest Number Less than the given number is : "+i);
    }   
}
