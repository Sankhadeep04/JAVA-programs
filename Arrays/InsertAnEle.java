import java.util.Scanner;

public class InsertAnEle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i =0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be inserted : ");
        int temp = sc.nextInt();
        System.out.println("Enter position to be inserted : ");
        int pos = sc.nextInt();
        if(pos <= 0 ||pos >n+1)
        {
            System.out.println("Invalid position");
        }
        else{
            for(int i = n;i >= pos;i--)
            {
                arr[i] = arr[i-1];
            }
            arr[pos-1] = temp;
            n++;
            System.out.println("after inserting the array is : ");
            for(int i=0;i<n;i++)
            {
                System.out.println(" "+arr[i]);
            }
        }
    }
}
