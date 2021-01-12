package p1.p2;
interface I2
{
    void f2();
}

public class SubClass1 implements I2
{
    public void f2()
    {
        System.out.println("Function of I2 I1 in package p1.p2");
    }
}