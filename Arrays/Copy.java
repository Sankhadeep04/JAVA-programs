import java.util.Scanner;
public class Copy 
{
    public static void main(String[] args) 
    {
        int[] arr1=new int[100];
        int[] arr2=new int[100];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        System.out.print("Enter elements of the array: ");
        for (int i=0;i<n;i++) 
        {
          arr1[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) 
        {
          arr2[i]=arr1[i];
        }
        System.out.println("Elements copied in the second array: ");
        for (int i=0;i<n;i++) 
        {
          System.out.print(arr2[i]+" ");
        }
    }
}