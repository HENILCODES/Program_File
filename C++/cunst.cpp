#include<iostream>
using namespace std;
class stucts
{
    int rol;
    public:
    stucts(int a)
    {
        rol = a;
        cout << a;
    }
};
int  main()
{
    stucts s2(5);
return 0;
}