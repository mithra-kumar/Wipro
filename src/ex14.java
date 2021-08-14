import java.util.Scanner;
public class ex14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		     int number1 = sc.nextInt();
		     int number2 = sc.nextInt();
		     int number3 = sc.nextInt();
		     int gcdNumbers = ex14.findGCD(number1, number2, number3);
		     System.out.println(gcdNumbers);
		     sc.close();
		  }
		  public static int findGCD(int x, int y)
		  {
		     if(y == 0)
		     {
		        return x;
		     }
		     else
		     {
		        return findGCD(y, x % y);
		     }
		  }
		  public static int findGCD(int x, int y, int z)
		  {
		     return findGCD(findGCD(x, y), z);
		  }

}
