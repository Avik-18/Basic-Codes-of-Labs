#include<iostream> 
#include<string> 
using namespace std; 
class String 
{ 
 private : 
  string s; 
 public : 
  String() 
  { 
   s=""; 
  } 
  void input() 
  { 
   cout<<"Enter the string "; 
   getline(cin,s); 
  } 
  String operator +(String s2) 
  { 
   String Sadd; 
   Sadd.s=s+" "+s2.s; 
   return Sadd; 
  } 
  int operator-(String s2) 
  { 
   int l; 
   l=s.length()-s2.s.length(); 
   if(l<0) 
   { 
    return -l; 
   } 
   return l; 
  } 
  void display() 
  { 
   cout<<"\n concatenated String : "<<s; 
  } 
}; 
int main() 
{ 
 String a,b,c; 
 int len; 
 a.input(); 
 b.input(); 
 c=a+b; 
 len=a-b; 
 c.display(); 
 cout<<"\n Length Difference : "<<len; 
 return 0;  
} 
