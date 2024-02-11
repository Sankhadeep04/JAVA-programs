import java.util.Scanner;

public class SeperateEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr = new int[50];
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array : ");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        } 
        int[] arr1 = new int[50];
        int[] arr2 = new int[50];
        int temp = 0;
        int temp1 = 0;
        for(int i = 0;i < n; i++)
        {
            if(arr[i] % 2 == 0)
            {
                arr1[temp] = arr[i];
                temp++;
            }
            else if(arr[i]  % 2 != 0)
            {
                arr2[temp1] = arr[i];
                temp1++;
            }
        }
        System.out.println("After seperatng the even array is : ");
        for(int i=0;i<temp;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("After seperatng the odd array is : ");
        for(int i=0;i<temp1;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
