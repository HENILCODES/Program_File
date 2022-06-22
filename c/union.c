#include<stdio.h>
#include<string.h>

 struct hvp
{
    int id;
    char name[35];
};
int main()
{
   struct hvp h;
   printf("\n enter id : ");
   scanf("%d",&h.id);
   printf("\n enter name :");
   scanf("%s",&h.name);

   printf("\n id :-",h.id);
   printf("\n name :-",h.name);
   return 0;
}