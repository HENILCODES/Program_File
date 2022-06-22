#include<iostream>
using namespace std;
class henil
{
    int a;
    public:
    int b;
   /* henil(000);
    henil(int get_a , int get_b)
    {
        a = get_a;
        b = get_b;
    }
    void ent()
   {
    cout << "a =" << a << " b =" << b;
   }*/
};
class prajapa : public henil
{
    int c;
    public:
    void mult()
    {
        c =5;
        b =5;
        cout << " c " << c*b ;
    }
};
int main()
{
    prajapa p;
    p.mult();
    return 0;
}