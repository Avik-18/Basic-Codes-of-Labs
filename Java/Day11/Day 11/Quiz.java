import java.io.Console;
public class Quiz
{
    public static void main(String args[])
    {
        Console s=System.console();
        int f=0;
        System.out.print("Enter the name ");
        String name=s.readLine();
        for(int i=0;i<3;i++)
        {
            System.out.print("Who is inventer of Java ");
            char inp[]=s.readPassword();
            String ans=String.valueOf(inp);
            if(ans.equalsIgnoreCase("James Gosling"))
            {
                f=1;
                break;
            }
            else
            {
                System.out.println("\fWrong Answer, Try Again");
            }
        }
        if(f==1)
        {
            System.out.println("Correct Answer");
            System.out.println("User : "+name+"\tScore : 10");
        }
        else
        {
            System.out.println("Limit Exceed for giving Answer");
            System.out.println("User : "+name+"\tScore : 0");
        }
    }
}
