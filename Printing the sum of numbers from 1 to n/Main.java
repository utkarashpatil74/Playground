#include <stdio.h>
int n;
int sum=0;
int main() {
  scanf("%d",&n);
  for(int count=1;count<=n;count++)
  {
    sum=sum+count;
  }
  printf("%d",sum);
	//Type your code
	return 0;
}