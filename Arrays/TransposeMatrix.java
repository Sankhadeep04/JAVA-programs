import java.util.Scanner;

public class TransposeMatrix {
    
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        int arr1[][] = new int[50][50];
        System.out.println("Enter row of first matrix : ");
        int row = sc.nextInt();
        System.out.println("Enter column of first matrix : ");
        int column = sc.nextInt();

        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < column;j++)
            {
                System.out.println("Element "+i+" "+j+":");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < column;j++)
            {
                arr1[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose Matrix is : ");
        for(int i = 0;i < row;i++)
            {
                for(int j = 0;j < column;j++)
                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();

            }
        

    }
}
