#include<stdio.h>
int main()
{
    int a;
    int *b;
    a=10;
    b=&a;
    printf("\n = %d",a);
    printf("\n = %d",b);
    return 0;
}