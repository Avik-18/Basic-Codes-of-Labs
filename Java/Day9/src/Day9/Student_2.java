package Day9;
import java.util.Scanner;
public class Student_2
{
    int roll,len;
    String name,stream,college;
    String sub[];
    int p[],th[];
    Student_2(int r,String na,String st,String cg)
    {
        name=na;
        roll=r;
        stream=st;
        college=cg;
    }
    public void get(String ...s)
    {
        len=s.length;
        th=new int[len];
        p=new int[len];
        sub=new String[len];
        sub=s;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter "+s[i]+" Theory Marks : ");
            th[i]=sc.nextInt();
            System.out.print("Enter "+s[i]+" Practical Marks : ");
            p[i]=sc.nextInt();
        }
    }
    public void display()
    {
        int tot=0;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Name : "+name+"\tRoll no : "+roll+"\nStream : "+stream+"\t\tCollege :"+college+"\nNumber of Subjects : "+len);
        System.out.println("-------------------------------------------------------------");
        System.out.println("\t\tTheory Marks\tPractical Marks");
        for(int i=0;i<len;i++)
        {
            tot=th[i]+p[i];
            System.out.printf( "%-15s %8d %15d %n", sub[i],th[i],p[i]);
        }
        System.out.println("\t\t\tGrand Total : "+tot);
    }
    public static void main(String args[])
    {
        Student_2 ob=new Student_2(1039,"Avik Ghosh","CSE","Techno India University");
        Student_2 ob1=new Student_2(1049,"Anubhav Dutta","ECE","NIT");
        
        System.out.println("For first Student : ");
        ob.get("Physics","Biology","Computer","Maths");
        System.out.println("For second Student : ");
        ob1.get("Physics","Biology","Chemistry","Computer","Maths");

        ob.display();
        ob1.display();
    }
}
