#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int val=1;
  for(int r=1;r<=n;r++)
  {
    for(int s=1;s<=(n-r);s++)
    {
      printf(" ");
     }
    for(int col=1;col<=r;col++)
    {
      printf("%d ",val);
      val++;
    }
    printf("\n");
  }
  return 0;
}
             
