import java.util.Scanner;
public class Search
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n,search,a=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n= sc.nextInt();
        System.out.println("Enter the elements in array: ");
        for (int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\nEnter element to search: ");
        search=sc.nextInt();
        for (int i=0;i<n;i++) 
        {
            if (arr[i]==search) 
            {
                a=i;
                break;
            }
        }
        if (a!=-1) 
        {
            System.out.println( search + " is found at position " + (a+ 1));
        } 
        else 
        {
            System.out.println(search + " is not found in the array");
        }
    }
}