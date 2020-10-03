import java.util.*;
import java.lang.*;
import java.io.*;
public class read
{

    public static void main (String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String id,na,cd;
        int price;        
        File f1=new File("item.txt");        
        if(f1.exists())
        {  
            System.out.print("Enter the code : ");
            cd=sc.nextLine();
            FileReader fin=new FileReader("item.txt");
            BufferedReader ffin=new BufferedReader(fin);
            while((id=ffin.readLine())!=null)
            {
                if(id.equalsIgnoreCase(cd))
                {
                    na=ffin.readLine();
                    price=Integer.parseInt(ffin.readLine());
                    System.out.println(id+" "+na+" "+price);
                }
            }
            ffin.close();
            fin.close();
        }
        else
        {
            System.out.println("No Such File");
        }
    }
}
            