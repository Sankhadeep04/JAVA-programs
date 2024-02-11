import java.util.Scanner;
public class LitProblem {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i = 0;i < n; i++)
        {
            for(int j = i+1;j < n;j++)
            {
                if(arr[i] == 0 && arr[j] != 0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The array is : ");
        for(int i = 0;i < n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
