import java.util.Scanner;


public class Logical_Operators {

 public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
 
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();


// && operator
System.out.println((a > b) && (c > a));  // true
System.out.println((a > b) && (c < a));  // false

// || operator
System.out.println((a < b) || (c > a));  // true
System.out.println((a > b) || (c < a));  // true
System.out.println((a < b) || (c < a));  // false

// ! operator
System.out.println(!(a == b));  // true
System.out.println(!(a > b));  // false
}


 
}