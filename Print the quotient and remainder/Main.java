#include<stdio.h>
int i=365;
int j=4;
int Quotient,Remainder;
int main()
{
  Quotient=i/j;
  printf("Quotient: %d\n",Quotient);
  Remainder=i%j;
  printf("Remainder: %d",Remainder); 
  
  return 0;
}