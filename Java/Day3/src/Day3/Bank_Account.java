package Day3;
class Bank_Account
{
    String name,type,acc_no;
    Bank_Account(String na,String an,String ty)
    {
        name=na;
        acc_no=an;
        type=ty;
    }
}
class Curr_Acct
{
    double balance;
    String name,acc_no;
    Curr_Acct(String na,String an,double amt)
    {
        name=na;
        acc_no=an;
        balance=amt;
    }
    void deposit(double amt)
    {
        balance=balance+amt;
        System.out.println("Deposited Amount : "+amt);
        System.out.println("Present Amount after Deposit : "+balance);
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
    void penalty()
    {
        if(balance<1000)
        {
            System.out.println("Penalty Amount : 100\nPresent Balance : "+(balance-100));
        }
    }
    void display()
    {
        System.out.println("Present Balance : "+balance);
    }
}
class Sav_Acct
{
    double balance;
    String name,acc_no;
    Sav_Acct(String na,String an,double amt)
    {
        name=na;
        acc_no=an;
        balance=amt;
    }
    void deposit(double amt)
    {
        balance=balance+amt;
        System.out.println("Deposited Amount : "+amt);
        System.out.println("Present Amount after Deposit : "+balance);
    }
    void interest(int r,int t)
    {
        double i=1.0+(r/100.0);
        balance=balance*(Math.pow(i,t));
        System.out.println("Balance after adding interest : "+balance);
    }
    void display()
    {
        System.out.println("Present Balance : "+balance);
    }
}
class Caller
{
    public static void main(String args[])
    {
        Bank_Account ob=new Bank_Account("Avik Ghosh","1234567890","Current");
        if(ob.type.equals("Current"))
        {
            System.out.println("Name : "+ob.name+"\tAcc no: "+ob.acc_no);
            System.out.println("-----------------------------------------");
            Curr_Acct ob1=new Curr_Acct(ob.name,ob.acc_no,5000.0);
            ob1.display();
            ob1.deposit(1500);
            ob1.withdrawl(5600);
            ob1.penalty();
        }
        else if(ob.type.equals("Savings"))
        {
            System.out.println("Name : "+ob.name+"\tAcc no: "+ob.acc_no);
            System.out.println("-----------------------------------------");
            Sav_Acct ob1=new Sav_Acct(ob.name,ob.acc_no,5000.0);
            ob1.display();
            ob1.deposit(7000);
            ob1.interest(5,2);
        }
        else
        {
            System.out.println("Wrong Account Type");
        }
    }
}