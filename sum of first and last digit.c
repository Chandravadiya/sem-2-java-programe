#include<stdio.h>
void main(){
	long int f,l,n,sum;
	printf("enter any number:");
	scanf("%ld",&n);
	 l=n%10;
	while(n>=10)
	{
		n=n/10;
	}
	f=n%10;
	sum=f+l;
	printf("sum =%d",sum);
}
