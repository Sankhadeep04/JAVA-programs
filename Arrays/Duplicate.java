import java.util.Scanner;
public class Duplicate {
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
    int j,sum = 0;
	for(i=0;i<n;i++)
	{
    	for(j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j]){

                sum++;
                break;
            }
        }
        
	}
    System.out.println("Total number of duplicate elements in the array are : "+sum);
    
}
}