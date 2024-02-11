import java.util.Scanner;

public class SumOfMainDiagonal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
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
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum = sum + arr[i][i];
        }
        System.out.println("The sum of main diagonal elements is : "+sum);
    }
}
