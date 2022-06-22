#include<stdio.h>

int main()
{
    int n,i,a[20],max,min;


    printf("\n how many number : ");
    scanf("%d",&n);
    
    for(i=0;i<n;i++)
    {
        printf("\n enter : ");
        scanf("%d",&a[i]);
    }

    printf("\n orignal \n");
    for(i=0;i<n;i++)
    {
        printf("\n %d",a[i]);
    }
    max=a[0];
    min=a[0];
    for(i=0;i<n;i++)
    {

    if(a[i]>max)
    {
        max=a[i];
    } 
    else
    {
        min=a[i];
    }

    }
    printf("\n max number %d",max);
    printf("\n minimum %d",min);
    return 0;
}