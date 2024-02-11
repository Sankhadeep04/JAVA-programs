import java.util.Scanner;
public class Reverse 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        System.out.println("Enter the elements in array: ");
        for(i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array in reverse order: ");
        for(i=n-1;i>=0;i--) 
        {
          System.out.print(arr[i]+" ");
        }
    }
}