/* sum of each element in matrix */

#include<stdio.h>
int main()
{
    int a[3][3],i,j,n,s;

    printf("\n enter ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {

            printf("\n enter number : ");
            scanf("%d",&a[i][j]);
        
        }
    } 

    printf("\n matrix is \n");

    for(i=0;i<n;i++)
    {
     for(j=0;j<n;j++)
        {
         printf("\t %d",a[i][j]);
        }
        printf("\n");
    }

     for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            s=s+a[i][j];
        
        }
    } 
    printf("\n sum %d",s);

    return 0;
}