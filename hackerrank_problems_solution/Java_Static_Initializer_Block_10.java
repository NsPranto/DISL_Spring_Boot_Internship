package hackerrank_problems_solution;

import java.util.Scanner;

public class Java_Static_Initializer_Block_10 {
	static int B, H;
	static boolean flag = true;
	static Scanner Scn = new Scanner(System.in);
	static {
		B = Scn.nextInt();
		H = Scn.nextInt();

		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception:Breadth and height must be positive");
			flag = false;
		}
	}

	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=false

		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main
}
