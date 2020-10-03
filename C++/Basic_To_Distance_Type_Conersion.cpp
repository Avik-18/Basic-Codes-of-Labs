#include<iostream>
using namespace std;
class Distance
{
	private :
		int foot,inch;
	public:
		Distance()
		{
			foot=0;
			inch=0;
		}
		void get()
		{
			
			cout<<"Enter the distance in inch ";
			cin>>inch;
		}
		void operator =(int d)
		{
			foot=d/12;
			inch=d%12;
		}
		void display()
		{
			cout<<foot<<" ft "<<inch<<" inch.\n";			
		}
};
int main()
{
	int d;
	Distance ob;
	cout<<"Enter the distance in inches ";
	cin>>d;
	ob=d;
	cout<<d<<" inches is equal to : ";
	ob.display();
	return 0;
}

