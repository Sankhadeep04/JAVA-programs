import java.util.Scanner;

public class InterchangeDiagonals {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        int arr1[][] = new int [50][50];
        System.out.println("Enter row of first matrix : ");
        int row = sc.nextInt();
        System.out.println("Enter column of first matrix : ");
        int column = sc.nextInt();
        System.out.println("Enter elements in first matrix : ");
        int i;
        int j;
        for( i = 0;i < row;i++)
        {
            for(j = 0;j < column;j++)
            {
                System.out.println("Element "+i+" "+j+":");
                arr[i][j] = sc.nextInt();
            }
        }
        int temp;
        int size;
        if(row < column)
        {
            size = row;
        }
        else
        {
            size = column;
        }
        for( i = 0;i < size;i++)
        {
            j = i;
            temp = arr[i][j];
            arr[i][j] = arr[i][(size-j)-1];
            arr[i][(size-j)-1] = temp;
        }
        System.out.println("After interchanging diagonals the matrix is : ");
        for(i = 0;i < row;i++)
        {
            for(j = 0;j < column;j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
