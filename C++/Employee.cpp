#include <iostream>
using namespace std;
class Employee
 {
 	public:
 		string id,name,dept;
 		int age,salary;
 	Employee()
	{
 		id="";
 		name="";
	 	dept="";
 		age=0;
 		salary=0;
 	} 	
 	void get()
 	{
 		cout<<"Enter name ";
 		cin>>name;
 		cout<<"Enter id ";
 		cin>>id;
 		cout<<"Enter department ";
 		cin>>dept;
 		cout<<"Enter salary ";
 		cin>>salary;
 		cout<<"Enter age ";
 		cin>>age;
 		
	}
	void display()
	{		
		cout<<name<<"\t\t"<<id<<"\t\t"<<dept<<"\t\t"<<salary<<"\t\t"<<age<<"\n";
	}
	~Employee(){
	}
};
int main()
{
	int ne;
	cout<<"Enter total no of employees ";
	cin>>ne;
	Employee* ob = new Employee[ne];
 	for(int i=0;i<ne;i++)
 	{
 		ob[i].get();
 	}
 	cout<<"Name \t\t ID \t\t Department \t\t Salary \t\t Age \n";
 	for(int i=0;i<ne;i++)
 	{
 		ob[i].display();
 	}
 	delete [] ob;
 	return 0;
}

