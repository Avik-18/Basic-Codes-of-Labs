#include<iostream>
using namespace std;
	class copy_con
	{
		private:
    		int num;
    	public:
    	copy_con(int a)
	{    
    		num=a;
    	}
    	copy_con( copy_con &c )
	{   
    		num = c.num;

    	}
    	void show( )
	{
    		cout<< num<<"\n";
    	}
    };
    int main()
	{
    	copy_con A(200),B(300);
    	copy_con C=A;  
    	cout<<"A : ";
    	A.show();
    	cout<<"B : ";
    	B.show();
        	cout<<"C : ";
    	C.show();
   	return 0;
    }

