import java.util.*;

class ArrayList
{
    int arr[] , index , size;
    
    ArrayList(int size)
	{
        index = -1;
        this.size = size;
        arr=new int[size];
    }
    
    void add(int data) 
	{
        if(index==size-1)
		{
            int temp[]=arr;
            size=size*2;
            arr=new int[size];
            for(int i=0; i<=index; i++)
			{
                arr[i]=temp[i];
            }
            arr[++index]=data;
        }
        else
            arr[++index]=data;
    }
    
    int findMax()
	{
       int max=arr[0];
        for(int x: arr)
		{
            max = max < x ? x : max;
        }
        return max;
    }
   
}

public class a1q1
{
	private static Scanner ip = new Scanner(System.in);
    public static void main(String args[])
	{
		System.out.println("Enter size");        
        int n = ip.nextInt();
  
        ArrayList a = new ArrayList(n);
        System.out.println("Enter array Elements");
        for(int i=0; i<n; i++)
		{    
            int x=ip.nextInt();   
            a.add(x);    
        }
        
		System.out.println("Enter array Elements again");
        for(int i=0; i<n; i++)
		{    
            int x=ip.nextInt();
            a.add(x);    
        }
        
        System.out.println("Maximum value in the array is : "+ a.findMax());       
        ip.close();
     }
}