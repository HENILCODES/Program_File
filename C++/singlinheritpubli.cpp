#include<iostream>
using namespace std;
class perent
{
    int a;
    public:
    int b;
    void put()
    {
    a = 5;
    b = 2;
    }
    void disp()
    {
    cout << "a =" << a << endl ;
    cout << "b =" << b << endl ;
    }
    int get_a()
    {
    return a;
    }
};
class child : public perent
{
    int c;
    public:
    void mult()
    {  
     c = 5;
    cout << "c * b =" << b*c  << endl ; 
    }
    void show()
    {
    cout << "a =" << get_a() << endl ;
    cout << "b =" << b << endl ;
    cout << "c =" << c << endl ;
    }
};
int main()
{
    child c1;
    c1.put();
    c1.disp();
    c1.mult();
    c1.show();
    
    c1.b=20;
    cout << "b =" << c1.b << endl;
    c1.mult();
    return 0;
}