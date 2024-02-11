import java.util.Scanner;
public class Unique {
public static void main(String[] args)
{
	int i,n;
    int arr[] = new int[50];
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total numbers of Elements : ");
	n=sc.nextInt();
    System.out.println("Enter Elements:");
	for(i=0;i<n;i++)
	{
        
		 arr[i]= sc.nextInt();
	}
    int j,k;
    System.out.println("Unique Elements are:");
	for(i=0;i<n;i++)
	{
		k=0;
    	for(j=0;j<n;j++)
        {
            if(arr[i]==arr[j])
            	k++;
        }
        if(k==1)
        {
        	System.out.println(arr[i]);
		}
	}
    
}
}