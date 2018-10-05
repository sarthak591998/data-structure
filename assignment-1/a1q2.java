import java.util.*;
class StringArray
{
    int index , size ;
    char CharArr[];
    
    StringArray(int size)
    {
    	this.size=size;        
        index = -1;        
        CharArr = new char[size];
    }
    
    void add(char c)
    {   
        if(index == size-1)
        {        
            char temp[] = CharArr;            
            size=size*2;            
            CharArr=new char[size];            
            for(int i=0; i<temp.length; i++)
            {                
                CharArr[i]=temp[i];
            }            
            CharArr[++index] = c;
        }        
        else
        	CharArr[++index] = c;
    }
    
    void sortArray()
    {        
        for(int i=0; i<size; i++){           
            for(int j=0; j<size; j++)
            {                
                char t1=CharArr[i];                
                char t2=CharArr[j];                
                if(Character.isUpperCase(t1))
                    t1=Character.toLowerCase(t1);
                
                if(Character.isUpperCase(t2))
                    t2=Character.toLowerCase(t2);
                
                if(t1<t2){                    
                    char c=CharArr[i];                    
                    CharArr[i]=CharArr[j];                    
                    CharArr[j]=c;
                }
            }
        }
        
        for(int i=0; i<size; i++){
            
            if(Character.isUpperCase(CharArr[i]))
                System.out.print(Character.toLowerCase(CharArr[i])+" ");
            else                
                System.out.print(Character.toUpperCase(CharArr[i])+" ");
        }
        
        System.out.println();
    }
}

public class a1q2
{
	private static Scanner ip = new Scanner(System.in);
    public static void main(String args[])
    {
    	System.out.println("Enter size");
        int n = ip.nextInt();
        
        StringArray a =  new StringArray(n);
        System.out.println("Enter character values : ");
        for(int i=0; i<n; i++)
        {
        	char c = ip.next().charAt(0);
            a.add(c);
        }
        
        a.sortArray();
	ip.close();
    }
}