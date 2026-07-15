import java.util.*;
class Scannerdemo
{
  public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first element");
		int x=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the second element");
		int y=Integer.parseInt(sc.nextLine());
		int c=x+y;
		System.out.println("Addition= "+c);
	}
}
