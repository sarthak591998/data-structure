import java.util.*;
class MyArray
{
    int arr[] , index , size;
	MyArray(int size)
	{
	   index=-1;
       this.size = size;
       arr=new int[size];
    }
   
    void add(int data) 
    {
       if(index == size-1)
       {        
          int temp[]=arr;
          size=size*2;
          arr=new int[size];
          System.arraycopy(temp, 0 , arr , 0 , temp.length);
	      arr[++index]=data;
       }
       else
          arr[++index]=data;
	        
	    }
	    
    void reverseArray()
    {
    	int j = arr.length-1;
        for(int i=0 ; i<j; i++ )
        {
        	int temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	        j--;
	    }
	}
	    
    void display()
    {
    	System.out.println("Reverse Elements are : ");
    	for(int x: arr){
          System.out.print(x+" ");
        }
    }
}   

public class a1q5
{
	private static Scanner ip = new Scanner(System.in);
	public static void main(String args[])
	{
	  System.out.println("Enter size");
	  int n = ip.nextInt();
	  MyArray a = new MyArray(n);
	  System.out.println("Enter elemnets ");
	  for(int i=0; i<n; i++)
	  {
		  int num = ip.nextInt();
	      a.add(num);
	  }
	  System.out.println("Enter N elements again");
	  for(int i=0; i<n; i++)
	  {
		  int num = ip.nextInt();
	      a.add(num);
	  }
	        
	  a.reverseArray();
	  a.display();
	  ip.close(); 
	}
}