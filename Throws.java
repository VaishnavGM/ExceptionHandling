package Vaish;
import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter age");
				int age = Scan.nextInt();
				Scan.close();
				S.method(age);
	
	}
		}
class S extends Exception
{
	
	S(String s){
		super(s);
		
	}
	public static void  method (int age)
	{
		
		try
	{
			if(age<18) {
			throw new S("jw"); 	
			}
          System.out.println("he is over age"); 		
}
	
			catch(S e)
			{
				System.out.println("he is underage");
			}

		
	 }
}


		









