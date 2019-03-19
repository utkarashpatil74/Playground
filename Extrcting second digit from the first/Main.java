#include <stdio.h>
int n,sd;
int main() {
  scanf("%d",&n);
  while(n>=100)
  {
    n=n/10;
  }
  sd=n%10;
  printf("%d",sd);
	//Type your code
	return 0;
}