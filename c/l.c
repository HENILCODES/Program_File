/* write a program of multiplication table for given number */

#include<stdio.h>

int main()
{
    int n , i ;

    printf("\n enter number : ");
    scanf("%d",&n);

    for(i=1;i<=10;i++)

    {
    
        printf("\n %d  X  %d  = %d",n,i,(n*i));
    
    }

    return 0;
}