import java.util.Scanner;
public class Increment_and_Decrement_Operators {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int result1;
  int result2;
 System.out.println("Value of a : " + a);
 result1 = ++a;
 System.out.println("After increment :" + result1);
 System.out.println("value of b :" + b);
 result2= --b;
 System.out.println("After decre :" + result2);
 }
}
