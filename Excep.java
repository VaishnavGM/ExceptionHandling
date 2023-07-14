package Vaish;

public class Excep {

	public static void main(String[] args) {
int a= 0;
int b= 0;
int c = 0;
try {
	 
c = a/b;
if(c==0)
{
	throw new ArithmeticException("iiiiii");
}
int m[] = null;
m[1] = 3;

}
catch(ArithmeticException e)
{
	System.out.println("it is arithmetic exceotion");
}
catch(NullPointerException n)
{
	System.out.println("it is null pointer exception");
}
finally
{
	System.out.println("sw");
}
System.out.println(c);
	}

}
