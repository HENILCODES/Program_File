#include<iostream>
using namespace std;
int main()
{
 char b[10],c[10];
 string a;
  
  cout << "enter :";
  // cin << ni jgya pr ave
  // getline no use jayer b nu datatype string hoy tyare ave
  getline(cin,a);

  cout <<"enter :";
  // cin.get use kray jyare a nu dtattype char hoy
  cin.get(b,10);

  cout <<"enter : ";
  cin >> c;

  cout << a << "\n " << b << "\n" << c;

  return 0;
}