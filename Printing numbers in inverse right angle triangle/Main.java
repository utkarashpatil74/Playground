#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  int val=n;
  for(int r=1;r<=n;r++)
  {
    for(int col=val;col>=1;col--)
    {
      printf("%d",col);
    }
val--;
    printf("\n");
  }
  return 0;
}
    // Type your code here
