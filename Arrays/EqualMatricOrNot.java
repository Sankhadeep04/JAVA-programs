import java.util.Scanner;

public class EqualMatricOrNot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        int arr1[][] = new int [50][50];
        System.out.println("Enter row of first matrix : ");
        int row = sc.nextInt();
        System.out.println("Enter column of first matrix : ");
        int column = sc.nextInt();
        System.out.println("Enter row of second matrix : ");
        int row2 = sc.nextInt();
        System.out.println("Enter column of second matrix : ");
        int column2 = sc.nextInt();
        int flag = 0;
        if(row == row2 && column==column2)
        {
            for(int i = 0;i < row;i++)
            {
                for(int j = 0;j < column;j++)
                {
                    System.out.println("Element "+i+" "+j+":");
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements in second array : ");
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
                for(int j = 0;j < column;j++)
                {
                    if (arr[i][j] != arr1[i][j]) 
                    {
                        flag++;
                        break;
                    }
                }
            }
            if(flag == 0)
            {
                System.out.println("both the matrix are equal");
            }
            else
            {
                System.out.println("both matrix are not equal");
            }
        }
        else
        {
            System.out.println("Both matrices are not equal.");
        }
    }
}