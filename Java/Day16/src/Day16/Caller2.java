package Day16;
public class Caller2
{
    public static void main(String args[])
    {
        String s="University of Technology",s1="";
        s=s+" ";
        int l=s.length();
        char c;
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            {
                s1=s1+c;
            }
            else
            {
                if(s1.startsWith("Tech"))
                {
                    System.out.println("Yes Present in the position : "+s.indexOf("Tech"));
                }
                else 
                {
                    s1="";
                    if(i==l-1)
                    {
                        System.out.println("Not present");
                    }
                }
            }
        }
    }
}
