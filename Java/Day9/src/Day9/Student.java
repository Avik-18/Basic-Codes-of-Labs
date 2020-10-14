package Day9;
public class Student 
{
    int roll;
    String name,stream,college;
    Student(int r,String na,String st,String cg)
    {
        name=na;
        roll=r;
        stream=st;
        college=cg;
    }
    void display()
    {
        System.out.println(name+"\t"+roll+"\t"+stream+"\t"+college);
    }
    public static void main(String args[])
    {
        Student ob=new Student(1039,"Avik Ghosh","CSE","Techno India University");
        Student ob1=new Student(1049,"Anubhav Dutta","ECE","NIT");
        System.out.println("Name\t\tRoll no\tStream\tcollege");
        ob.display();
        ob1.display();
    }
}
