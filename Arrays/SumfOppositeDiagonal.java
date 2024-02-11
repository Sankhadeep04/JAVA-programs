import java.util.Scanner;

public class SumfOppositeDiagonal {
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
        int sum = 0;
        
        for(i = 0;i < n;i++)
        {
            for(j = 0;j < n;j++)
            {
                if( i+j == ((n+1)-2))
                sum = sum + arr[i][j];
            }
        }
        System.out.println("The sum of opposite diagonal elements is : "+sum);
    }

}
