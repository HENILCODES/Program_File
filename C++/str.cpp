// use string function

#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[10h],b[10],c[10];
  int n;
  cout << "enter  a :";
  cin << a;
  cout << "enter  b :";
  cin >> b;

 // it's use for camper 2 string are equal or not 

 if(strcmp(a,b)==0)
 {
  cout << "\n  string equal ";
 }
 else
 {
   cout << " \n string not equal";
 }
 
 // it's use for count string charecter 
  n=strlen(a);
  cout << "\n string  a lenth =" << n;
  
 // it's use for join 2 string 
  strcat(a,b);
  cout << "\n string a & b cat =" << a ;
 
  // it's  use for copy string
  strcpy(c,b); 
  cout << "\n string b copy to c is = " << c;

  // it's use for revers string
  strrev(c);
  cout << "\n string c  revers =" << c ;

  return 0;
}