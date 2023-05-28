package hackerrank_problems_solution;

import java.util.Scanner;
public class Java_IntTo_String_11 {
 public static void main(String[] args) {

    //https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

   String s = Integer.toString(n);//This is the (Int to string) converting function

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  
 }
}
