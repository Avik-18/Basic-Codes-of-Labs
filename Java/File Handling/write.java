import java.util.*;
import java.lang.*;
import java.io.*;
public class write
{

    public static void main (String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String id,na;
        int n,price;
        System.out.print("Enter the no of items ");
        n=sc.nextInt();
        sc.nextLine();
        File f1=new File("item.txt");
        if(f1.exists())
        {        
            FileWriter fout=new FileWriter("item.txt",true);
            BufferedWriter ffout=new BufferedWriter(fout);
            PrintWriter ob=new PrintWriter(ffout);
            for(int i=1;i<=n;i++)
            {
                System.out.print("Enter id : ");
                id=sc.nextLine();
                id=id.toUpperCase();
                System.out.print("Enter item name : ");
                na=sc.nextLine();
                na=na.toUpperCase();
                System.out.print("Enter price : ");
                price=sc.nextInt();
                sc.nextLine();
                ob.println(id);
                ob.println(na);
                ob.println(price);
            }
            ob.close();  
        }
        else
        {
            FileWriter fout=new FileWriter("item.txt");
            BufferedWriter ffout=new BufferedWriter(fout);
            PrintWriter ob=new PrintWriter(ffout);                 
            for(int i=1;i<=n;i++)
            {
                System.out.print("Enter id : ");
                id=sc.nextLine();
                id=id.toUpperCase();
                System.out.print("Enter item name : ");
                na=sc.nextLine();
                na=na.toUpperCase();
                System.out.print("Enter price : ");
                price=sc.nextInt();
                sc.nextLine();
                ob.println(id);
                ob.println(na);
                ob.println(price);
            }
            ob.close(); 
        }
    }
}
            