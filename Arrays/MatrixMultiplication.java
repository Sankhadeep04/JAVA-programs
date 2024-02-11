import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        int arr1[][] = new int [50][50];
        int arr3[][] = new int[100] [100];
        int sum = 0;
        System.out.println("Enter row of first matrix : ");
        int row = sc.nextInt();
        System.out.println("Enter column of first matrix : ");
        int column = sc.nextInt();
        System.out.println("Enter row of second matrix : ");
        int row2 = sc.nextInt();
        System.out.println("Enter column of second matrix : ");
        int column2 = sc.nextInt();
        if(column != row2)
        {
            System.out.println("The matrix multiplication is not possible.");
        }
        else
        {
            System.out.println("Enter elements in first matrix : ");
            for(int i = 0;i < row;i++)
            {
                for(int j = 0;j < column;j++)
                {
                    System.out.println("Element "+i+" "+j+":");
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements in second matrix : ");
            for(int i = 0;i < row2;i++)
            {
                for(int j = 0;j < column2;j++)
                {
                    System.out.println("Element "+i+" "+j+":");
                    arr1[i][j] = sc.nextInt();
                }
            }
            for(int i = 0;i < row;i++)
            {
                for(int j = 0;j < column2;j++)
                {
                    arr3[i][j]=0;
                    for(i = 0;i < row;i++)
                    {
                        for(j = 0;j < column2;j++)
                        {
                            sum = 0;
                            for(int k = 0;k < column;k++)
                            {
                                sum=sum+arr[i][k]*arr1[k][j];
                                arr3[i][j] = sum;
                            }
                        }
                    }
                }
		    
            }
            System.out.println("Multiplication of two matrices : ");
            for(int i = 0;i < row;i++)
            {
                for(int j = 0;j < column2;j++)
                {
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();

            }
        }
    }
}
