#include <stdio.h>
int n,ld,fd,sum;
int main() {
  scanf("%d",&n);
  ld=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  fd=n;
  sum=fd+ld;
  printf("%d",sum);
	//Type your code
	return 0;
}