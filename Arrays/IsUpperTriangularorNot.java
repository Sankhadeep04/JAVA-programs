import java.util.Scanner;

public class IsUpperTriangularorNot {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int flag = 1;
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
            for(int j = 0;j < i;j++)
            {
                if(arr[i][j] != 0)
                {
                    flag = 1;
                    break;
                }
            }
        }
        System.out.println("THE Matrix -- ");
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        if(flag == 1)
        {
            System.out.println("The Matrix is Upper Triangular");
        }
        else
        {
            System.out.println("The matrix is not upper triangular");
        }
        
    }
}
