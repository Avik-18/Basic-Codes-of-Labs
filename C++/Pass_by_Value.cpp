#include <iostream>
using namespace std;
void swap(int x, int y)
{
	int temp = x;
	x = y;
	y = temp;
}
int main()
{ 
	int a,b;
	cout<<"enter two numbers";
	cin>>a>>b;
	cout << "Before Swap\n";
	cout << "a = " << a << " b = " << b << "\n";
	swap(a, b);
	cout << "After Swap with pass by reference\n";
	cout << "a = " << a << " b = " << b << "\n";
	return 0;
}

