#include<iostream> 
using namespace std; 
class Complex 
{ 
 private : 
  double real,img; 
 public : 
  Complex() 
  { 
   real=0.0; 
   img=0.0; 
  } 
  void input() 
  { 
   cout<<"Enter 1st no "; 
   cin>>real; 
   cout<<"Enter 2nd no "; 
   cin>>img; 
 
  } 
  Complex operator -(Complex y) 
  { 
   Complex x; 
   x.real=real-y.real; 
   x.img=img-y.img; 
   return x; 
  } 
  Complex operator *(Complex y) 
  { 
   Complex x; 
   x.real=(real*y.real)+(img*y.img); 
   x.img=(real*y.img)+(img*y.real); 
   return x; 
  } 
  Complex operator +(Complex y) 
  { 
   Complex x; 
   x.real=real+y.real; 
   x.img=img+y.img; 
   return x; 
  } 
  void display() 
  { 
   if(img>0) 
   { 
    cout<<real<<" + "<<img<<" i "; 
   } 
   else 
   { 
    cout<<real<<" "<<img<<" i "; 
   } 
  } 
}; 
int main() 
{ 
 Complex a,b,c,d,e; 
 cout<<"\nEnter First complex number : \n"; 
 a.input(); 
 cout<<"\n First complex number : "; 
 a.display(); 
  
 cout<<"\n\n Enter Second complex number : \n"; 
 b.input(); 
 cout<<"\n Second complex number : "; 
 b.display(); 
  
 cout<<"\n\n Enter Third complex number : \n"; 
 c.input(); 
 cout<<"\n Third complex number : "; 
 c.display(); 
  
 cout<<"\n\n Enter Fourth complex number : \n"; 
 d.input(); 
 cout<<"\n Fourth complex number : "; 
 d.display(); 
  
 e=a-b*c+d; 
 cout<<"\n\n Final result : "; 
 e.display(); 
  
 return 0;  
}
