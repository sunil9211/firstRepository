package lambda_expression;

interface InterF
{
	public void SquareIt(int n);
}
public class Lambda3
{
 public static void main(String[] args) 
 {
   	InterF it = n -> System.out.println(n*n);
   	it.SquareIt(10);
}
}