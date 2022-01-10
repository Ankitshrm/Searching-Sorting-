import java.util.Scanner;

public class mergeSort {


    private static int [] merge(int a[],int low,int hi){
        
        if(low==hi){
            int as[]=new int[1];
            as[0]=a[low];
            return as;

        }

        int mid=(hi+low)/2; 
        int fsa[]=merge(a, low, mid);
        int lsa[]=merge(a, mid+1, hi);
        int ans[]=mergeSortedArray(fsa,lsa);

        return ans;
    }

    private static int [] mergeSortedArray(int a[],int b[])
    {
        int m=a.length;
        int n=b.length;
        int i=0;
        int j=0;
        int k=0;
        int []c=new int[m+n];

        while(i<m && j<n)
        {
            if(a[i]<=b[j])
            {
                c[k]=a[i];
                i++;k++;
            }
            else{
                c[k]=b[j];
                j++;k++;
            }
        }

        while(i<m){
            c[k]=a[i];
            i++;k++;
        }

        while(j<n)
        {
            c[k]=b[j];
            j++;k++;
        }

        return c;
    }

    private static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner  ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        int ans[] =merge(a,0,n-1);
        printArray(ans);
        ip.close();






    }
}
