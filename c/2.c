#include<stdio.h>
int main()
{
    int  n,i=1,f=1;
    printf("\n enter number : ");
    scanf("%d",&n);

    while (i<=n)
    {
        
        f=f*i;
        i++;
    }   
        printf("\n fact is %d",f);
    
}