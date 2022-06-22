#include<iostream>
using namespace std;
class perent
{
    int a;
    public:
    int b;
    void put_a()
    {
        a = 5;
        cout << "a =" << a << endl;
    }
    void put_b()
    {
        b = 5;
        cout << "a*b = " << a*b << endl;
    }
};
class child : perent
{
    int c;
    public:
    void multi()
    {
        put_a();
        put_b();
    }
    void show()
    {
        cout << "c =" << c;
    }
};
int main()
{
    child c1;
    c1.multi();
    c1.show();
    
    return 0;
}