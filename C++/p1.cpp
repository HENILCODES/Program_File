#include<iostream>
using namespace std;

int main()
{
    int a,b,c;
    cout <<"\n enter first number : ";
    cin  >> a;
    cout <<"\n enter second number : ";
    cin  >> b;

    c = a+b;
    cout <<"\n addition is =" << c;
    
    c = a-b;
    cout <<"\n subtraction is =" << c;
    
    c = a*b;
    cout <<"\n Multiplication is= " << c;
    
    c = a/b;
    cout <<"\n Division is= " << c;
   return 0;
}