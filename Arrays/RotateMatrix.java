// import java.util.Scanner;

// public class RotateMatrix {
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int arr[][] = new int[50][50];
//         int arr1[][] = new int [50][50];
//         System.out.println("Enter the order of square matrix : ");
//         int n = sc.nextInt();
//         for(int i = 0;i < n;i++)
//         {
//             for(int j = 0;j < n;j++)
//             {
//                 System.out.println("Element "+i+" "+j+":");
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int k = 0;
//         for(int i = (n-1);i >= 0;k++,i--)
//         {
//             for(int j = 0;j < n;j++)
//             {
//                 arr1[i - i + k][j] = arr[i-j][i-i+k];
//             }
//         }
        
//         for(int i = 0;i < n;i++)
//             {
//                 for(int j = 0;j < n;j++)
//                 {
//                     System.out.print(arr1[i][j]+" ");
//                 }
//                 System.out.println();
//             }
//     }
// }
import java.util.Scanner;

public class RotateMatrix {
    
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
        
        for(int i = 0;i < n;i++)
        {
            for(int j = i;j < n;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n/2;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }   
    
        System.out.println("After rotating the matrix is : ");
        for(int i = 0;i < n;i++)
            {
                for(int j = 0;j < n;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    
    }
}