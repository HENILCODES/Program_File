#include<stdio.h>
int main()
{
    float major, minor,area, PI = 3.14;
    printf("Enter Length of major axis : ");
    scanf("%f",&major);
    
    printf("Enter Length of minor axis : ");
    scanf("%f",&minor);

    area = PI * major * minor;

    printf("Area of ellipse = %f",area);
    return 0;
}
