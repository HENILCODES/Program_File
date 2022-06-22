#include<iostream>
using namespace std;
int main()
{
    int a;
    int *p;
    a=10;
    p= &a;
    cout << a << "\n";
    cout << *p << "\n";
    cout << p << "\n";
    
    
    ++(*p);
    cout << a << "\n";
    cout << *p << "\n";
  
      
    --(*p);
    cout << a << "\n";
    cout << *p << "\n";

 return 0;
}