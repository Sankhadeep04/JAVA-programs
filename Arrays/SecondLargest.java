import java.util.Scanner;
public class SecondLargest {
    
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
        int large = arr[0];
        for(int i = 0;i < n; i++)
        {
            if(arr[i]>large)
            {
                large = arr[i];
            }
        }
        int secondlarge = -1;
        for(int i = 0;i < n;i++)
        {
            if(arr[i]>secondlarge && arr[i] != large)
            {
                secondlarge = arr[i];
            }
        }
        System.out.println("The second largest element of the array is : "+secondlarge);
    }
}
