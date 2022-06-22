#include<iostream>
using namespace std;

int h1(int a, int b)
{
    return a+b;
}
int main()
{  
    int a=10,b=15,c;
    
    c=h1(a,b);
    cout <<"answer =" << c;
    return 0;
}