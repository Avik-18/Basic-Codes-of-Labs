package Day16;
public class Caller1
{
    public static void main(String args[])
    {
        String s="My Name is Avik Ghosh";
        int l=s.length();
        char c[]=new char[l];
        for(int i=0;i<l;i++)
        {
            c[i]=s.charAt(i);
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}
