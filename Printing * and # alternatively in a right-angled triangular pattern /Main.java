#include <stdio.h>
int n,turn=0;
int main(){
  scanf("%d",&n);
  for(int r=1;r<=n;r++)
  {
    for(int c=1;c<=r;c++)
    {
      if(turn==0)
      {
        printf("*");
          turn=1;
      }
        else{
          printf("#");
           turn=0;
        }
    }
    printf("\n");
  }
	// Type your code here
  	return 0;
}