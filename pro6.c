#include <stdio.h>

int main()
{
int a[6]={1,3,2,4,5,4};
int i,j,count=0,n=5;
for(i=0;i<n;i++)
{
    for(j=1+i;j<=n-2;j++)
    {
        if(a[i]<a[j]&&a[j]<a[j+1])
        {
        count++;
        }
    }
}
printf("%d",count);
}