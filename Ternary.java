import java.util.Scanner;
public class Ternary {

 
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  
  int year = sc.nextInt();
  
  String result;
     result = ( year == 365 ) ? "Not a leap year" : "Leap year";
     System.out.println(result);

  
 }
}