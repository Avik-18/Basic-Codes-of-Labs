package Day_4;
public class EMP
{
    String name,department,doj;
    int id;
    EMP()
    {        
        department="IT";
    }
    EMP(String name,int id,String department)
    {       
       this();
       this.name=name;
       this.id=id;
       if(!department.equals(""))
       {
            this.department=department;
       }
    }
    EMP(String name,int id,String department,String doj)
    {
        this(name,id,department); 
        this.doj=doj;
    }
    void display()
    {  
         System.out.println(name+" "+id+" "+department+"\t\t"+doj);    
    }
    public static void main(String args[])
    {
        EMP ob[]=new EMP[3];
        ob[0]=new EMP("ABCD",1234,"IT","15/02/2008");
        ob[1]=new EMP("WXYZ",1258,"Management","5/12/2017");
        ob[2]=new EMP("PQRS",1788,"","20/9/2020");
        System.out.println("Name  Id  Department Date of Joining");
        for(int i=0;i<3;i++)
        {
            ob[i].display();
        }
    }
}
