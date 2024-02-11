import java.util.Scanner;

public class SumOfUpperTriangular {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter elements : ");
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                System.out.println("Element "+i+" "+j+":");
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                if(j > i)
                {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum of upper triangular is : "+sum);
        
    }
}
