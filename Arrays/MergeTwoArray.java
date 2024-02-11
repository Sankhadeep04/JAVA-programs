import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]arr = new int[50];
        System.out.println("Enter the length of first array : ");
        int n = sc.nextInt();
        int[] arr1 = new int[50];
        System.out.println("Enter elements in first array : ");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        } 
        System.out.println("Enter length of second array : ");
        int m = sc.nextInt();
        System.out.println("Enter elements in second array : ");
        for(int i = 0;i < m;i++)
        {
            arr1[i] = sc.nextInt();
        } 
        int[] arr2 = new int[100];
        for(int i = 0;i < n; i++)
        {
            arr2[i] = arr[i];
        }
        for(int i = 0 ; i < m;i++)
        {
            arr2[i+n] = arr1[i];
        }
        int temp;
        int sum = n+m;
        for(int i=0;i<sum-1;i++)
        {
            for(int j=0;j<sum-1-i;j++)
            {
                if(arr2[j+1]<arr2[j])
                {
                    temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        System.out.println("after merging the sorted array is : ");
        for(int i = 0; i<sum;i++)
        {
            System.out.println(" "+arr2[i]);
        }

    }
}
