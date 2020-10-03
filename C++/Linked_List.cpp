#include<iostream>
#include<stdlib.h>
using namespace std;
//Data members of node.
class LL 
{
	public:
		//data variable is use to store data.
		int data;
		//next is use to store the next address of the node.
		LL *next;
};
//class having property for initialization, deletion and display of the link list.
class link : public LL
{
	private:
		LL *head;
	public:
		//default constructor to initialize head with NULL.
		link()
		{
			head=NULL;
		}
		//destructor to free the dynamic memory at the end of the program. 
		~link()
		{
			cout<<"\n\nDestructor called \n";
			delete head;
		}
		//operator overloading fucntion is used to insert data in the node from the begining end.
		void operator +(int i)
		{
			LL *ins=new LL;
			ins->data=i;
			ins->next=NULL;
			if(head==NULL)
			{
				head=ins;
				return;
			}
			ins->next=head;
			head=ins;
		}
		//operator overloading fucntion is used to delete data from the node according to the key value.
		void operator -(int i)
		{			
			if(head==NULL)
			{
				cout<<"Empty list.\n";
				return;
			}
			LL *dis=new LL;
			dis=head;
			int f=0;
			while(dis!=NULL)
			{
				if(dis->data==i)
				{
					f=1;
					break;
				}				
				dis=dis->next;
			}
			
			if(f==1)
			{
				
				if(head->data==i)
				{
					LL *ptr=new LL;
					ptr=head;
					head=head->next;
					cout<<"\nDeleted Elelement is : "<<ptr->data<<"\n";
					free(ptr);
					return;
				}				
				LL *ptr=new LL;
				LL *prev=new LL;
				ptr=head;
				while(ptr->next!=NULL && ptr->data!=i)
				{
					prev=ptr;
					ptr=ptr->next;					
				}
				prev->next=ptr->next;
				cout<<"\nDeleted Elelement is : "<<ptr->data<<"\n";
				free(ptr);
			}
			else
			{
				cout<<"\nElement not present.\n";
			}

		}
		//Function for displaying the link list.
		void display()
		{
			LL *dis=new LL;
			if(head==NULL)
			{
				cout<<"Empty list.\n";
				return;
			}
			dis=head;
			while(dis!=NULL)
			{
				cout<<dis->data<<",";
				dis=dis->next;
			}
			cout<<"\n";
		}
};

//main to access the program.
//Insert, Delete and Display function is called from the main.
int main()
{
	link ob;
	int c,i;
	do
	{
		cout<<"Enter 1 to insert. \n";
		cout<<"Enter 2 to delete. \n";
		cout<<"Enter 3 to display. \n";
		cout<<"Enter 4 to exit. \n";
		cout<<"Enter your choice : ";
		cin>>c;
		switch(c)
		{
			case 1:
				cout<<"Enter the data to be entered : ";
				cin>>i;
				ob+i;
				break;
			case 2:
				cout<<"Enter the data to be deleted : ";
				cin>>i;
				ob-i;
				break;
			case 3:
				cout<<"\nPresent Linked List : \n";
				ob.display();
				break;
			default:
				cout<<"Wrong input. \nEnter a Number between 1-4. \n";
		}
	}while(c!=4);
	
	return 0;
}

