package Day3;
class Bank_Account_2
{
    String name,type,acc_no;
    Bank_Account_2(String na,String an,String ty)
    {
        name=na;
        acc_no=an;
        type=ty;
    }
}
class Deposit_Withdrawl
{
    double balance;
    String dpname,acc_no,address;
    Deposit_Withdrawl(String na,String an,String ad,double amt)
    {
        dpname=na;
        acc_no=an;
        address=ad;
        balance=amt;
    }
    void deposit(double amt)
    {
        balance=balance+amt;
        System.out.println("Deposited Amount : "+amt);
        System.out.println("Present Amount after Deposit : "+balance);
    }
    void withdrawl()
    {
        System.out.println("It is a Current Account, hence withdrawl not possible");
    }
    void withdrawl(double amt)
    {
        if(balance>=amt)
        {
            balance=balance-amt;
            System.out.println("Amount withdrawl from the account is : "+amt);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    void interest(int r,int t)
    {
        double i=1.0+(r/100.0);
        balance=balance*(Math.pow(i,t));
        System.out.println("Balance after adding interest : "+balance);
    }
    void penalty()
    {
        if(balance<1000)
        {
            System.out.println("Penalty Amount : 100\nPresent Balance : "+(balance-100));
        }
    }
    void display()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Depositor name : "+dpname+"\tAdrress : "+address+"\nAccount Number : "+acc_no);
        System.out.println("Present Balance : "+balance);
    }
}
class Caller_2
{
    public static void main(String args[])
    {
        Bank_Account_2 ob[]=new Bank_Account_2[2];
        ob[0]=new Bank_Account_2("Avik Ghosh","1234567890","Savings");
        ob[1]=new Bank_Account_2("Anubhav Dutta","9876543210","Current");
        Deposit_Withdrawl ob3=new Deposit_Withdrawl("Sauradip Paul","1234567890","Barrackpore",5000);
        int f=0;
        for(int i=0;i<2;i++)
        {
            if(ob3.acc_no.equals(ob[i].acc_no))
            {
                f=1;
                if(ob[i].type.equals("Savings"))
                {
                    System.out.println("Name : "+ob[i].name+"\tAcc no: "+ob[i].acc_no);
                    System.out.println("-----------------------------------------");
                    ob3.deposit(15000);
                    ob3.withdrawl(5600);
                    ob3.interest(5,2);
                    ob3.display();
                    break;
                }
                else if(ob[i].type.equals("Current"))
                {
                    System.out.println("Name : "+ob[i].name+"\tAcc no: "+ob[i].acc_no);
                    System.out.println("-----------------------------------------");
                    ob3.deposit(7000);
                    ob3.withdrawl(5600);
                    ob3.display();
                    break;
                }
            }                
        }
        if(f==0)
        {
                System.out.println("Wrong Account No");
        }
    }
}