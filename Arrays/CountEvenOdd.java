import java.util.Scanner;
public class CountEvenOdd
{
    public static void main(String[] args) 
    {
        int[] arr=new int[100];
        int n,even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n= sc.nextInt();
        System.out.print("Enter the elements in array: ");
        for(int i=0; i <n;i++) 
        {
          arr[i]=sc.nextInt();
        }
        for(int i=0;i <n;i++) 
        {
            if(arr[i]%2==0) 
            {
              even++;
            } 
            else 
            {
              odd++;
            }
        }
        System.out.println("Total even elements: " + even);
        System.out.println("Total odd elements: " + odd);
    }
}