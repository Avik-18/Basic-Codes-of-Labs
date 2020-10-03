#include<iostream>
using namespace std;
	class copy_con
	{
		private:
    		int num;
    	public:	
    	copy_con(int a)
    	{
    		num=0;
	}
    	copy_con operator =(copy_con &c)
	{  			
    		num=c.num;
    		return *this;
    	}
    	void show( )
	{
    		cout<< num<<"\n";
    	}
    };
    int main()
	{
    	copy_con A(200),B(300);    	    	
    	cout<<"A : ";
    	A.show();
    	cout<<"B : ";
    	B.show();    	
    	cout<<"After using B=A : \n";
    	B=A;  		    	
    	cout<<"A : ";
    	A.show();
    	cout<<"B : ";
    	B.show();
    	
   	return 0;
    }

