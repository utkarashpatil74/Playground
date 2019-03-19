#include <stdio.h>
int n;

int main() {
  scanf("%d",&n);
  for(int count=1;count<=n;count++)
  {
    if(count%2==1)
      printf("%d\n",count);
  }
	//Type your code
	return 0;
}