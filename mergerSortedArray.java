import java.util.Scanner;

public class mergerSortedArray {

    private static void sorting(int a[],int b[])
    {
        int m=a.length;
        int n=b.length;
        int c[]=new int [m+n];

        int i=0;
        int j=0;
        int k=0;

       while(i<m && j<n)
       {
           if(a[i]<b[j]){
               c[k]=a[i];
               i++;
               k++;
           }
           else{
               c[k]=b[j];
               j++;
               k++;
           }
       }

       while(i<m){
           c[k]=a[i];
           i++;
           k++;
       }

       while(j<n)
       {
           c[k]=b[j];
           j++;
           k++;
       }

       printarray(c);
       
      
    }

    private static void printarray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        System.out.println("Enter limit of 1st");
        int m =ip.nextInt();
        int a[]=new int[m];
        

        for(int i=0;i<m;i++)
        {
            a[i]=ip.nextInt();
        }
        System.out.println("Enter limit of 2nd");
        int n=ip.nextInt();
        int b[]=new int[n];

        for(int i=0;i<n;i++)
        {
            b[i]=ip.nextInt();
        }

        sorting(a,b);
       

        ip.close();
    }
}
