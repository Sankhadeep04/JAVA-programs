import java.util.Scanner;
public class NegetiveElements 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        System.out.println("Enter the elements in array: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("All the negative elements in the array are: ");
        for(int i=0;i<n;i++) 
        {
            if(arr[i]<0) 
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}