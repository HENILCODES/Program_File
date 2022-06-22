#include<iostream>
#include<string.h>
using namespace std;
class details
{
    public:
    int roll,age;
    char name[10];
    void env();
};
void details :: env()
{
    roll=19;
    strcpy(name,"henil");
    age=18;
    cout << roll << endl << name << endl << age;
}
int main()
{
    details d1;
    d1.env();
    return 0;
}