#include<iostream>
#include<cstring>
using namespace std;
int main()
{
    char a[10]="hi",b[10];
    do
    {   
        cout << "enter name :";
        cin >> b ;
    } while (strcmp(a,b)!=0);
    cout <<"it's match";
    return 0;  
}