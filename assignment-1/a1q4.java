import java.util.*;
public class a1q4
{
	private static Scanner ip = new Scanner(System.in);
    public static void main(String args[])
	{
		System.out.println("Enter size");
		int n = ip.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++)
        {    
            for(int j=0; j<n; j++)
            {
                arr[i][j] = ip.nextInt();
            }
        }
        
        for(int i=0; i<n; i++)
        {
        	if( i%2 == 0)
        		for(int j=0; j<n; j++)
        		{   
        			if( arr[i][j] == arr[n-1][n-1])
        			{
        				System.out.print(arr[i][j]);
        			}
        			else
        				System.out.print(arr[i][j] + ",");
        		}
        	else
        		for(int j=n-1 ; j>=0 ; j--)
        		{
        			if( arr[i][j] == arr[n-1][0])
        			{
        				System.out.print(arr[i][j]);
        			}
        			else
        				System.out.print(arr[i][j] + ",");
        		}
        }
        ip.close();
    } 
}