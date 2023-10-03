#include<stdio.h>
void main(){
	int sum,i=-1,n=1;
	float avg;
	while(n!=0)
	{
		scanf("%d",&n);
		
		sum=sum+n;
		i++;
	}
	avg=(float)sum/i;
	printf("sum =%d",sum);
	printf("avg =%f",avg);
}
