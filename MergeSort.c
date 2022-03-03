
#include <stdio.h>
int Merge_sort(int a[],int lb,int ub)
{
    if(lb<ub)
    {
        int mid=(lb+ub)/2;
        Merge_sort(a,lb,mid);
        Merge_sort(a,mid+1,ub);
        Merge(a,lb,mid,ub);
    }
}
void  Merge(int a[],int lb,int mid,int ub)
{
    int b[100],i,j,k;
    i=k=lb;
    j=mid+1;
    while(i<=mid&&j<=ub)
    {
        if(a[i]>a[j]){
            b[k]=a[j];
            k++;
            j++;
        }
        else{
            b[k]=a[i];
            k++;
            i++;
        }
    }
    while(i<=mid)
    {
        b[k]=a[i];
        i++;
        k++;
    }
    while(j<=ub)
    {
        b[k]=a[j];
        k++;
        j++;
    }
    for(int i=0;i<=ub;i++)
    {
        a[i]=b[i];
    }
}
void print_Array(int a[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
}
void main()
{
    int a[6]={23,12,32,1,11,100};
    printf("Unsorted Array:\n")
    print_Array(a,6);
    Merge_sort(a,0,5);
    printf("\n");
    printf("Sorted Array:\n")
    print_Array(a,6);
}
