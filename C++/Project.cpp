#include <iostream>
using namespace std;
class Project
 {
 	public:
 		string name,StDate;
 		int na;
 	Project()
	{
 		name="";
 		StDate="";
 		na=0;
 	} 	
 	void getP()
 	{
 		cout<<"Enter project name ";
 		cin>>name;
 		cout<<"Enter project start date ";
 		cin>>StDate;
		cout<<"Enter no of activity ";
		cin>>na;		
	}
	
void displayP()
	{
		cout<<name<<"\t\t"<<StDate<<"\t\t\n\n";
	}
	~Project(){
	}
};
class Activity : public Project
 {
 	public:
 		string id,stdate,hr;
 	Activity()
	{
 		id="";
 		stdate="";
	 	hr="";
 	} 	
 	void get()
 	{
 		cout<<"Enter id ";
 		cin>>id;
 		cout<<"Enter activity start date ";
 		cin>>stdate;
 		cout<<"Enter hour ";
 		cin>>hr; 		
	}
	void display()
	{		
		cout<<id<<"\t\t\t"<<stdate<<"\t\t\t"<<hr<<"\t\t\t\n";
	}
	~Activity(){
	}
};
int main()
{
	int np,tna=0;
	cout<<"Enter no of project ";
	cin>>np;
	Project* ob = new Project[np];
	for(int i=0;i<np;i++)
 	{
 		ob[i].getP();
 		tna=tna+ob[i].na;
 	}
	Activity* ob1 = new Activity[tna];
	for(int i=0;i<np;i++)
 	{
 		for(int j=0;j<ob[i].na;j++)
 		{
 			cout<<"Enter activities for project "<<j+1<<"\n";
 			ob1[j].get();
 		}
 	} 	
 	for(int i=0;i<np;i++)
 	{
 		cout<<"Project Name \t\t Project Start Date \t\t\n";
 		ob[i].displayP();
 		cout<<"-------------------------------------------------------------------------\n";
 		cout<<" ID \t\t Start Date \t\t Hour \n\n";
 		for(int j=0;j<ob[i].na;j++)
 		{
 			ob1[j].display();
 		}
 		cout<<"-------------------------------------------------------------------------\n";
 	}
 	delete [] ob;
 	delete [] ob1;
 	return 0;
}

