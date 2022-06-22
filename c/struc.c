#include<stdio.h>
#include<string.h>
typedef struct student
{
    /* data */
    int rollno;
    char name[10];
}st[5];

int main()
{
    int i;
//struct student st[5];
printf("\n enter  record");
for(i=0;i<2;i++)
{
    printf("\n enter roll :");
    scanf("%d",&st[i].rollno);

    printf("\n enter name :");
    scanf("%s",st[i].name);
}

printf("\n record");

for ( i = 0; i < 2; i++)
{
    printf("\n %d  %s ",st[i].rollno , st[i].name);
}
return 0;

}
