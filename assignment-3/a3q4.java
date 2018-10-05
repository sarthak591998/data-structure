import java.util.*;
public class Main {
  public static int find_power(int x,int y) {
    if(y==0)
    return 1;
    else
    return (x*find_power(x,y-1));
  }
  public static void main(String[] args) {
   //System.out.println("Hello world!");
   Scanner obj = new Scanner(System.in);
   int x = obj.nextInt();
   int y = obj.nextInt();
   int ans = find_power(x,y);
   System.out.println(ans);
  }
}