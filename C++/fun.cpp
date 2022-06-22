#include<iostream>
using namespace std;
 void h1(int n)   //1
{
    for (int i = 0; i < n; i++)
    {
        cout << "Henil" << "\n";     
    }
}           
    
  int sum(int a, int b) //2
    { 
        return a+b;
    }
   float subtrec(float  a, float b) //3
   {
       return a-b;
   }
 int main()
{
    h1(2);      //1

    int a=20 ,b=10 ,p,s; 
    cout <<"a ="<< a << "\n" <<"b =" <<b << "\n" ;        
    p=sum(a,b);   
    cout <<"plus= " << p <<"\n";
    s=subtrec(a,b);                                     
    cout << "sub= " << s<<"\n"  ;    

    return 0; 
}   