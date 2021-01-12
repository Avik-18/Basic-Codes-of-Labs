package Day11;
import java.io.Console;
public class Caller1 
{
    public static void main(String args[])
    {
        Console s=System.console();
        String r,c;
        int sum=0;
        System.out.print("Enter the row of array ");
        r=s.readLine();
        System.out.print("Enter the column of array ");
        c=s.readLine();
        int row=Integer.parseInt(r);
        int col=Integer.parseInt(c);
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("Enter the elements ");
                r=s.readLine();
                arr[i][j]=Integer.parseInt(r);
            }            
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i!=j)
                {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("Sum of all the elements leaving the diagonal is : "+sum);
    }
}
