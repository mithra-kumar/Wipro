import java.util.Scanner;
public class ex2 {
	public static void main(String[] args)
	{
	int n=25,c=0, max;
	Scanner s = new Scanner(System.in);
	int a[] = new int[n];
	System.out.println("Enter the elements of array:");
	for(int i = 0; i < n; i++)
	{
	a[i] = s.nextInt();
	}
	max = a[0];
	for(int i = 0; i < n; i++)
	{
	if(max < a[i])
	{
	max = a[i];
	}
	}
	for(int i = 0; i < n; i++)
	{
	if(max == a[i])
	{
	c=c+1;
	}
	}
	System.out.println(c);
	}



}
