#include <stdio.h>
int n;
int s=0;
int main() {
  scanf("%d",&n);
  while(n!=0)
  {
    int r=n%10;
    s=s+r;
    n=n/10;
  }
  printf("%d",s);
	//Type your code
	return 0;
}