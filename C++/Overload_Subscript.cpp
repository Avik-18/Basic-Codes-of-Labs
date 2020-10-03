// Overloading operators for Array class 
#include <iostream>  
using namespace std; 
 
// A class to represent an integer array 
class Array 
{ 
	private: 
    	int *a; 
    	int l; 
  
	public: 
	
	// constructor for array class 
		Array(int size)
		{
			a=new int[size];
			l=size;
			int i;
			//Initializing the array with default value
			for(i=0;i<l;i++)
			{
				a[i]=-9999;
			}			
		}
		
	// Destrcutor to delete the dynamically allocated memory 
	 	~Array()
	 	{
	 		delete []a;
		}
		
	/* Overloading [] operator to access elements in array style ,
	Implementation of [] operator. This function must return a reference as array element can be put on left side*/ 
		int &operator[](int i) 
		{ 
    		if (i>=l)
			{ 
       	 		cout << "Array index out of bound \n\n"; 
       	 		return a[-1];
        		}	 
    		return a[i];
    	}
};

  
// Driver program to test above methods 
int main() 
{     
	int l,i,n;
	char c='c';
	cout<<"Enter the length of array ";
	cin>>l;
	
	//Creating an object and initializing the array with default values
 Array ob(l);
    
  //Changing values in the array using Subscript overloaded function
	while(1)
	{
		if((c=='c' || c=='C') && (c!='e' || c!='E'))
		{
			cout<<"Enter the index position betwwen 0 to "<<l-1<<" : ";
			cin>>i;
			cout<<"Enter the element ";
			cin>>n;
			ob[i]=n;
			cout<<"To end the array input and to see the array enter 'e' \nor\nenter 'c' to continue changing elements ";
			cin>>c;	
			cout<<"\n";		
		}
		else if((c!='c' || c!='C') && (c=='e' || c=='E'))
		{
			break;
		}
		else
		{
			cout<<"To end the array input and to see the array enter 'e' \nor\nenter 'c' to continue changing elements ";
			cin>>c;
		}
	}
	
	//Display the array using Subscript overloaded function
	cout<<"Array Index \t Array elements \n";
	for(i=0;i<l;i++)
	{
		if(ob[i]!=-9999)
		{
			cout<<"a["<<i<<"] : \t\t\t"<<ob[i]<<"\n";
		}
	}
 return 0; 
}

