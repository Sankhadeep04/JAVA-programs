import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args)
    {
        int[] arr =new int[50];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("sum of all elements is : "+sum);
    }
}
