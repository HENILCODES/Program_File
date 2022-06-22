    /* write a program to sum matrix using 2-D arry */

    #include<stdio.h>

    int main()
    {
        int a[3][3], b[3][3], c[3][3] ;
        int i, j, n ;

        printf("\n enter how many number : ");
        scanf("%d",&n);

        printf("\n A matrix ");

        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                printf("\n enter number : ");
                scanf("%d",&a[i][j]);
            }
        }

        printf("\n B matrix  ");

        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                printf("\n enter number : ");
                scanf("%d",&b[i][j]);
            }    
        }

        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
            c[i][j]=a[i][j] * b[i][j];

            }
        }        
        
        printf("\n A matrix present \n ");
            for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                printf("\t %d",a[i][j]);
            }   
            printf("\n");

        }  
        printf("\n B matrix present \n");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                printf("\t %d",b[i][j]);
            }    
            printf("\n");
        }  

        printf("\n sum of  A + B  matrix \n ");

        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                printf("\t %d",c[i][j]);

            }
    
        printf("\n");

        }        

        return 0;
    }