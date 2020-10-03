package Day3;
import java.util.Scanner;
public class Student_2 {
    int roll;
    String name,stream,college;
    int th[]=new int[6];
    int p[]=new int[6];
    String sub[]={"Physics","Maths","Chemistry","History","Geography","Biology"};;
    Student_2()
    {
        name="";
        roll=0;
        stream="";
        college="";
        for(int i=0;i<6;i++)
        {
            th[i]=0;
            p[i]=0;
        }
    }
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name : ");
        name=sc.nextLine();
        System.out.print("Enter Roll : ");
        roll=sc.nextInt();
        System.out.print("Enter Stream : ");
        stream=sc.next();sc.nextLine();
        System.out.print("Enter College : ");
        college=sc.nextLine();
        for(int i=0;i<6;i++)
        {
            System.out.print("Enter "+sub[i]+" Theory Marks : ");
            th[i]=sc.nextInt();
            System.out.print("Enter "+sub[i]+" Practical Marks : ");
            p[i]=sc.nextInt();
        }
    }
    public void display()
    {
        int tot=0;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Name : "+name+"\tRoll no : "+roll+"\nStream : "+stream+"\t\tCollege : "+college);
        System.out.println("-------------------------------------------------------------");
        System.out.println("\t\tTheory Marks\tPractical Marks");
        for(int i=0;i<6;i++)
        {
            tot=th[i]+p[i];
            System.out.printf( "%-15s %8d %15d %n", sub[i],th[i],p[i]);
        }
        System.out.println("\t\t\tGrand Total : "+tot);
    }
    public static void main(String args[])
    {
        Student_2 ob=new Student_2();
        ob.get();
        Student_2 ob1=new Student_2();
        ob1.get();  
        ob.display();
        ob1.display();
    }    
}
