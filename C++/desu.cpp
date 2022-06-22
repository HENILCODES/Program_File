#include <iostream>
using namespace std;
int cont = 0;
class sempl
{
public:
    sempl()
    {
        cont++;
        cout << "cout is create =" << cont << endl;
    }
    ~sempl()
    {
        cont--;
        cout << "cout destroy =" << cont << endl;
    }
};
int main()
{
    cout << " main cretae " << endl;
    sempl s1;
    cout << "s2 cretae" << endl;
    sempl s2;
    cout << "s2 desry" << cont << endl;

    cout << "main destroy" << endl;
    return 0;
}