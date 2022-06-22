#include<iostream>
using namespace std;
int main()
{
    char ch[]={'a','b','c','d'};           
    char *p = &ch[0];                                                                                                                                                                                                                                 
    cout << p ;                    
    cout << "\n" << *p;

    char ch1[]="xyz";
    char *p1= &ch1[0];
    cout <<  "\n" << p1;

    char *p2;
    p2 =&ch1[0];
    cout <<  "\n" << p2;

    while (*p != '10' )
    {
        cout << "\n" << *p;
        *p++;
    }
    

}