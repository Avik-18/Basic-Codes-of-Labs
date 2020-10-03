package Day_4;
public class Sum_Average 
{
    public static void main(String args[])
    {
        int arr[]={5,10,25,30,50};
        int sum=0;
        double average;
        System.out.println("Elements present in array : ");
        for(int i:arr)
        {
            sum=sum+i;
            System.out.print(i+", ");
        }
        average=sum/5.0;
        System.out.println("\n\nSum of the array elements is : "+sum);
        System.out.println("\nAverage of the array elements is : "+average);
    }  
}
