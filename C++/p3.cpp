#include<iostream>
using namespace std;
int main()
{
    int x,y,z,a;

    cout<< "enter of x= ";
    cin >> x;

    cout << " enter of y =";
    cin >> y;
    
    cout << " enter of z =";
    cin >> z;

    a= x + (y*y) -z;
    cout << "answer of ( x + y2 -z ) = " << a;
 
    return 0;
}