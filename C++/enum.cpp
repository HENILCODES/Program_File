#include<iostream>
using namespace std;
enum color{red, blue,green };
int main()
{
    int col;
    cout << "enter color =";
    cin >> col;
    switch (col)
    {  
        case red:
        cout << "red";
        break;

        case blue:
        cout << "blue";
        break;

        case green: 
        cout << "green ";
        break;
     default: cin >> col; 
    }

    return 0;
}