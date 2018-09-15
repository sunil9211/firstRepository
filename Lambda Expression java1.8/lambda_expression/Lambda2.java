package lambda_expression;

import java.util.Scanner;

interface I1
{
	void Aaloo(int a, int b, int c);
}
public class Lambda2 
{
public static void main(String[] args) 
{
   	Scanner sc = new Scanner(System.in);
   	System.out.println("Enter three values a, b then c:");
   	int x = sc.nextInt() , y = sc.nextInt(), z = sc.nextInt();
   	I1 obj = (int a, int b, int c) -> System.out.println("(a+b)/c = "+(a+b)/c);
   	obj.Aaloo(x, y, z);
   	
}
}
