import java.util.Scanner;
public class Frequency {
static void frequency(int arr1[],int arr2[],int n)
{
	int i,ctr,j;
    for(i=0;i<n;i++)
    {
        ctr=1;
        for(j=i+1;j<n;j++)
        {
            if(arr1[i]==arr1[j])
            {
                ctr++;
                arr2[j] = 0;
            }
        }
        if(arr2[i]!=0)
        {
            arr2[i] = ctr;
        }
    }
}
public static void main(String[] args)
{
    int n,i;
    int arr1[] = new int[50];
    int arr2[] = new int[50];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array :");
    n=sc.nextInt();

    System.out.println("Enter the elements of the array:\n");
    for(i=0;i<n;i++)
    {
	    arr1[i]= sc.nextInt();
		arr2[i]=-1;
	}
	frequency(arr1,arr2,n);
	System.out.println("The frequency of all elements of array: \n");
    for(i=0;i<n;i++)
    {
        if(arr2[i]!=0)
        {
            System.out.print(arr1[i] ); 
            System.out.print(" found ");
            System.out.print(arr2[i] );
            System.out.println(" times ");       

        }
    }
}
}