package Practice;
public class Prog2
{
    public static void main(String args[])
    {
        int arr[]={14,0,5,2,0,3,0};
        System.out.println("Original Array :");
        for(int i=0;i<7;i++)
        {
            System.out.print(arr[i]+", ");
        }
        for(int i=0;i<7;i++)
        {
            if(arr[i]==0)
            {
                for(int j=i;j<6;j++)
                {
                    int x=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;
                }
            }
        }
        System.out.println("\nChanged Array :");
        for(int i=0;i<7;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}
