package lambda_expression;
interface MyInterface
{
	public void fun(int a, int b);
	default void myFun()
	{
	   System.out.println("Hello this is myFun!");	
	}
}
public class Lambda1 
{
public static void main(String[] args) {
	MyInterface mi = (int a, int b) -> System.out.println("a+b "+a+b);
	mi.fun(5, 2);
	mi.myFun();
	
}
}
