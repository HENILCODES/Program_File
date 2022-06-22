#include<stdio.h>

int h1(int a, int b)
{
    return a + b;
}
int main()
{
    int a,b,c;
    a = 5;
    b = 5;
    c = h1(a,b);
    printf("\n answer = %d",c);
    return 0;
}