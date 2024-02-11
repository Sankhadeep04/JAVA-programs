import java.util.Scanner;
public class CountNegetiveElements 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n= sc.nextInt();
        System.out.print("Enter the elements in array: ");
        for (int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) 
        {
            if (arr[i]<0) 
            {
              count++;
            }
        }
        System.out.println("Total number of negative elements in array:" +count);
    }
}