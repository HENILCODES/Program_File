#include<iostream>
using namespace std;
class calculate
{
    int a,b,c;
    public:
    void getdata();
    int add();
    int sub();
    float divd();
    int multi(); 
};
void calculate :: getdata()
{
    cout << "enter first number :";
    cin >> a;

    cout << "enter second number :";
    cin >> b; 
}

int calculate :: add()
{
    c = a+b;
    return c;
}

int calculate :: sub()
{
    c = a - b;
    return c;
}

float calculate :: divd()
{
    c = a / b;
    return c;
}

int calculate :: multi()
{
    c = a*b;
    return c;
}

int main()
{       
    calculate c1;
    c1.getdata();
    cout << "addition =" << c1.add() <<endl;
    cout << "subtrect =" << c1.sub() <<endl;
    cout << "multiply =" << c1.multi() <<endl;
    cout << "dived    =" << c1.divd() <<endl;
    
    return 0;                                                   
}