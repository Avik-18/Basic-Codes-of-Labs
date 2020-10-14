package Practice;
public class Prog1
{
    public static void main(String args[])
    {
        int arr[]={1,1,0,0,0,1,0,1,0,1};
        int l=arr.length;
        int zero=0;
        System.out.println("Original Array :");
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+", ");
        }
        for(int i=0;i<l;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
        }
        for(int i=0;i<l;i++)
        {
           if(i<zero)
           {
               arr[i]=0;
           }
           else
           {
               arr[i]=1;
           }
        }
        System.out.println("\nSorted Array :");
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}
