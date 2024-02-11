import java.util.Scanner;

public class RightRotateArray {
    public static void main(String [] args)
    {   
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array ");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of time the array will rotate : ");
        int temp = sc.nextInt();
        System.out.println("Before rotation the array was : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i < temp;i++)
        {
            int last = arr[n-1];
            for(int j = n-1;j > 0;j--)
            {
                arr[j] = arr[j-1];
            }     
            arr[0] = last;
        }
        System.out.println("After rotation the array is : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
