import java.util.Scanner;

public class InsertionSort {
    private static void disp(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    private static void insertion(int a[]){

        for(int i=0;i<a.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(isGrater(a, j, j+1))
                {
                    swap(a,j, j+1);
                }
            }
        }
    }
    private static boolean isGrater(int a[],int i,int j){
        System.out.println("Compartion "+a[i]+" and "+a[j]);
        if(a[i]>a[j])
            return true;
        else
            return false;
        
    }

    private static void swap(int a[],int i,int j)
    {
        System.out.println("Swapping of "+a[i]+" and "+a[j]);
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n =ip.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }

        insertion(a);
        disp(a);

        ip.close();
    }
}

