import java.util.Scanner;

public class Sort {
    public static void main(String[]  args)
    {
        Scanner sc=new Scanner(System.in);
        int[]arr = new int[50];
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array : ");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        } 
        int temp;
        for(int i=0;i<n-1;i++)
	    {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("after sorting in ascending order the array is : ");
        for(int i = 0;i < n;i++)
        {
            System.out.println(" "+arr[i]);
        }
        System.out.println("after sorting in descending order the array is : ");
        for(int i = n-1;i >= 0;i--)
        {
            System.out.println(" "+arr[i]);
        }

    }
}
