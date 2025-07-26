import java.util.Scanner;
public class bitwise_operators {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("Value 1: "+a);
	int b=sc.nextInt();
	System.out.println("Value 2: "+b);
	int c=0;
	c=a&b;
	System.out.println("a & b: "+c);
	c=a|b;
	System.out.println("a | b: "+c);
	c=a^b;
	System.out.println("a ^ b: "+c);
	c=~a;
	System.out.println("~a: "+c);
	c=a<<b;
	System.out.println("a << b: "+c);
	c=a>>b;
	System.out.println("a >> b: "+c);
	c=a>>>b;
	System.out.println("a >>> b: "+c);
	
}
}