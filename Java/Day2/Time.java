import java.util.*;
public class Time
{
    public int conv_to_sec(String t1)
    {
        String s="";
        char c;
        int n1=0,n2=0,n3=0;
        for(int i=0;i<8;i++)
        {
            c=t1.charAt(i);
            if(c!=':')
            {
                s=s+c;
            }
            else if(c==':' && i==2)
            {
                n1=Integer.parseInt(s);
                n1=n1*60*60;
                s="";
            }
            else if(c==':' && i==5)
            {
                n2=Integer.parseInt(s);
                n2=n2*60;
                s="";
            }
        }
        if(s!="")
        {
            n3=Integer.parseInt(s);
            s="";
        }
        return (n1+n2+n3);
    }
    public static void main(String args[])
    {
        int n1=0;
        String t1,t2,s="";
        Time ob=new Time();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time in this format HH:MM:SS");
        System.out.print("Enter the First Time ");
        t1=sc.next();
        System.out.print("Enter the Second Time ");
        t2=sc.next();
        if(t1.length()==8 && t2.length()==8)
        {
            int ts=ob.conv_to_sec(t1);
            ts=ts+ob.conv_to_sec(t2);
            if(ts>=3600)
            {
                n1=ts/3600;
                ts=ts-(n1*3600);
                if(n1>9)
                {
                    s=n1+":";
                }
                else
                {
                    s="0"+n1+":";
                }
            }
            if(ts>=60 && ts<3600)
            {
                n1=ts/60;
                ts=ts-(n1*60);
                if(n1>9)
                {
                    if(s!="")
                    {
                        s=s+n1+":";
                    }
                    else
                    {
                        s="00:"+n1+":";
                    }
                }
                else if(n1<9)
                {
                    if(s!="")
                    {
                        s=s+"0"+n1+":";
                    }
                    else
                    {
                        s="00:0"+n1+":";
                    }
                }
            }
            if(ts>=0 && ts<60)
            {
                if(ts>9)
                {
                    if(s!="" && s.length()==6)
                    {
                        s=s+ts;
                    }
                    else if(s!="" && s.length()==3)
                    {
                        s=s+"00:"+ts;
                    }
                    else
                    {
                        s="00:00:"+ts;
                    }
                }
                else if(ts<9)
                {
                    if(s!="" && s.length()==6)
                    {
                        s=s+"0"+ts;
                    }
                    else if(s!="" && s.length()==3)
                    {
                        s=s+"00:0"+ts;
                    }
                    else
                    {
                        s="00:00:0"+ts;
                    }
                }                
            }
            System.out.println("Total Time is : "+s);
        }
        else
        {
            System.out.println("Wrong Format or invalid input");
        }
    }
}