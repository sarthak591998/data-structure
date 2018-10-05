import java.util.*;
public class a1q3
{
	private static Scanner ip = new Scanner(System.in);

	public List<Integer> intersection(int arr1[], int arr2[]) 
	{
		List<Integer> intersect1 = new ArrayList<Integer>();
		List<Integer> intersect2 = new ArrayList<Integer>();
		List<Integer> intersect3 = new ArrayList<Integer>();
	
		for (int i: arr1) {
			intersect1.add(i);
		}
		
		for (int i: arr2) {
			intersect2.add(i);
		}
		
		for (int i: arr2) {
			int occ1 = Collections.frequency(intersect1,i);
			int occ2 = Collections.frequency(intersect2,i);
			if (occ1 != 0 && !(intersect3.contains(i))) { 
				if (occ1 < occ2)
					while (occ1-- != 0)
						intersect3.add(i);
				else if (occ2 < occ1)
					while (occ2-- != 0)
						intersect3.add(i);
				else if (occ2 == occ1)
					while (occ1-- != 0)
						intersect3.add(i);
			}
		}
		Collections.sort(intersect3);
		return intersect3;
	}
	
	public static void main(String []args) 
	{
		IntersectionOfElement obj = new IntersectionOfElement();
		System.out.println("Enter First Array size");
		int n1 = ip.nextInt();
		
		int arr1[] = new int[n1];
		System.out.println("Enter first elements : ");
		for (int i=0;i<n1;i++)
			arr1[i] = ip.nextInt();
		
		System.out.println("Enter Second Array size");
		int n2 = ip.nextInt();
		
		int arr2[] = new int[n2];
		System.out.println("Enter second elements : ");
		for (int i=0;i<n2;i++)
			arr2[i] = ip.nextInt();
		
		System.out.println(obj.intersection(arr1,arr2).toString());
	}
}