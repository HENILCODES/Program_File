/* 1-D ARRE IN multiyply OF TWO ARRY  */

#include<stdio.h>
int main()
{
    int i,a[3],b[3],c[3];

    printf("\n A array:- ");
    for(i=0;i<3;i++)
    {
        printf("\n enter number : ");
        scanf("%d",&a[i]);
    } 
     
    printf("\n  B  arrey:- ");

    for(i=0;i<3;i++)
    {
        printf("\n enter number : ");
        scanf("%d",&b[i]);

    }

    for(i=0;i<3;i++)
    {
        c[i]=a[i] * b[i];

    }
     
    printf("\n now multiply  is:- ");
    for (i=0;i<3;i++)
    {
        printf("\n %d",c[i]);
    }

    return 0;
}