import java.util.Scanner;

public class Transpose {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[50][50];
        System.out.println("Enter the number of Rows : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int m = sc.nextInt();

        System.out.println("Enter elements : ");
        for(int i = 0; i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                System.out.println("Element "+i+" "+j+":");
                arr[i][j] = sc.nextInt();
            }
        }
        int temp;
        for(int i = 0; i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                if(i != j && j > i)
                {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
                
            }
        }
    
        System.out.println("Transpose Matrix is : ");
        for(int i = 0;i < n;i++)
            {
                for(int j = 0;j < m;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }
    }
}
