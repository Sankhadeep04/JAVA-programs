import java.util.Scanner;

public class SumfEachRowAndCol {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        System.out.println("Enter the order of square matrix : ");
        int n = sc.nextInt();
        int i;
        int j;
        for( i = 0;i < n;i++)
        {
            for( j = 0;j < n;j++)
            {
                System.out.println("Element "+i+" "+j+":");
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(i = 0;i < n;i++)
        {
            int sum =0;
            for(j = 0;j < n;j++)
            {
                sum = sum + arr[i][j];
            }
        System.out.println("Sum of "+(i+1)+"row is :"+sum); 
        }
        for(i = 0;i < n;i++)
        {
            int sum =0;
            for(j = 0;j < n;j++)
            {
                sum = sum + arr[j][i];
            }
        System.out.println("Sum of "+(i+1)+" column is :"+sum); 
        }
    }
}
