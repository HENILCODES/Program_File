#include<iostream>
using namespace std;
class student
{   public:
    int roll;
    string name;    
};
int main()
{
    student s;
    s.roll=1;
    s.name="henil";   
    cout << "roll =" << s.roll <<"\n";
    cout << "name = " << s.name;
    return 0;
}