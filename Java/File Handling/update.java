import java.util.*;
import java.io.*;
public class update
{

    public static void main (String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String id,na,cd;
        int price;  
        
        System.out.print("Enter the code : ");
        cd=sc.nextLine();
        
        FileReader fin=new FileReader("item.txt");
        BufferedReader ffin=new BufferedReader(fin);
        
        FileWriter fout=new FileWriter("up_item.txt");
        BufferedWriter ffout=new BufferedWriter(fout);
        PrintWriter ob=new PrintWriter(ffout);
            
        while((id=ffin.readLine())!=null)
        {
            na=ffin.readLine();
            price=Integer.parseInt(ffin.readLine());
            if(id.equalsIgnoreCase(cd))
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
            else
            {
                ob.println(id);
                ob.println(na);
                ob.println(price); 
            }
        }
        ffin.close();
        fin.close();
        ob.close();    
        
        File f1=new File("item.txt");
        f1.delete();
        File f2=new File("up_item.txt");
        boolean ren=f2.renameTo(f1);
        if(ren==true)
        {
            System.out.println("Successful");
        }
        else
        {
            System.out.println("Not");
        }
    }
}
            