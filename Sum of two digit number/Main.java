#include<stdio.h>
int i,j,k,sum;
int main()
{
  scanf("%d",&i);
  j=i%10;
  k=i/10;
  sum=j+k;
  printf("%d",sum);
  return 0;
}