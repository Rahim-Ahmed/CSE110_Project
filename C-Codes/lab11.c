#include<stdio.h>
#include<string.h>
 struct book
              {
             char name[100], author[100];
              int page;
              int price;

                };



  int main()
{

          struct book x[20];
             int i,n,y,m=0;
             int o[100];

          printf("enter the number of book= ");
          scanf("%d",& n);


               for(i=0;i<n;i++){
                   printf("\n Enter the name of book= ");
                    scanf(" %s",& x[i].name);
                    printf("Enter the author's name= ");
                 scanf("%s",& x[i].author);
                  printf("Enter the page of book= ");
                   scanf("%d",& x[i].page);
                 printf("Enter the prize of book= ");
                   scanf("%d",& x[i].price);


               }

               for(i=1;i<n;i++){
                   m=0;
                   if((x[i].name)== a || x[i].name==e||x[i].name==i||x[i].name==o||x[i].name==u||x[i].name==A||x[i].name==E||x[i].name==I||x[i].name==O||x[i].name==U)
                    {
                        m++;
                   o[i]=m;
                   }
                   }

                   for(i=1;i<n;i++){
                    m=o[0];
                    if(o[i]>m){
                            m=o[i];
                        y=i;
                    }
                   }



              printf("\n Enter the name of book=%s " ,x[y].name);
                    printf("Enter the author's name= %s",x[y].author);
                  printf("Enter the page of book= ",x[y].page);
                 printf("Enter the prize of book= ",x[y].price);

  return 0;
}




/*
#include<stdio.h>
#include<string.h>
 struct river
              {
             char name[100], origin[100];

             float length;
                };



  int main()
{

          struct river x[20];
             int i,n,y;
             float m=0.0;
          printf("enter the number of river= ");
          scanf("%d",& n);


               for(i=0;i<n;i++){
                   printf("\n enter the name of river= ");

                    scanf(" %s",& x[i].name);
                    printf("enter the length of river= ");
                 scanf("%f",& x[i].length);
                 printf("enter the origin of river= ");
                   scanf("%s",& x[i].origin);
               }

               for(i=1;i<n;i++){
                   m=x[0].length;
                   if((x[i].length)>m){
                       m=x[i].length;
                       y=i;
                   }
                   }

             printf(" the longest river is = %s and length is = %0.2lf",x[y].name,m);



  return 0;
}
*/
