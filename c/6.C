#include<stdio.h>
int main()
{
    int n,i,a[20];
    int max,min;

    printf("\n how many numbers : ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        printf("\n enter number : ");
        scanf("%d",&a[i]);
    }

    printf("\n 1-D arry ");
    for ( i=0;i<n;i++)
    {
        printf("\n %d",a[i]);
    }
     
    max=a[0] ;
    min=a[0] ;
     for (i=0;i<n;i++)
     {
        if(a[i]>max)
        {
            max=a[i];
        }

        if(a[i]<min)
        {
            min=a[i];
        }
     }

     printf("\n Maximum number in 1-D arry : %d",max);

     printf("\n Minimum number in 1-D arry : %d",min);
     
     return 0;
}