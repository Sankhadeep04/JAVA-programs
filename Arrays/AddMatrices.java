import java.util.Scanner;

public class AddMatrices {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        int arr1[][] = new int [50][50];
        int arr2[][] = new int[100][100];
        System.out.println("Enter the order of square matrix : ");
        int n = sc.nextInt();
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                System.out.println("Element "+i+" "+j+":");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements in second array : ");
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                System.out.println("Element "+i+" "+j+":");
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                arr2[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        System.out.println("The addition of two marices is ");
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                System.out.print(arr2[i][j]+" ");

            }
            System.out.println();
        }
    }
}
