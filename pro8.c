#include <stdio.h>
void gcd(int n1,int n2)
{
    int gcd1;
for(int i=1; i <= n1 && i <= n2; ++i)
    {
        if(n1%i==0 && n2%i==0)
            gcd1 = i;
    }

    printf("%d\n",gcd1);
}
int main()
{
   int n=5,n1,n2;
    int a[100]={1,2,3,4,5},q1,q2;
    int q=2;
   for(int j=0;j<2;j++)
    {
        scanf("%d%d",&q1,&q2);
        gcd(a[q1+1],a[q2+1]);
    }
    
}