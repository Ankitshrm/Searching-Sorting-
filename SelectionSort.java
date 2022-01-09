import java.util.Scanner;

public class SelectionSort {

    private static void selection(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(isSmall(a,j,min))
                {
                    min=j;
                }
            } 
            swap(a,i,min);
        }
    }
    
    private static void disp(int a[])
    {
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    private static boolean isSmall(int a[],int i,int j){
        System.out.println("Compartion "+a[i]+" and "+a[j]);
        if(a[i]<a[j])
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

        selection(a);
        disp(a);

        ip.close();
    }
}


