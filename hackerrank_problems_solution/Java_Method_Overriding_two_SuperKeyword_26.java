
class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());

		String temp = super.define_me(); // Fix this line

		System.out.println("My ancestor is a cycle who is " + temp);
	}

}

class Solution {
	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
		MotorCycle M = new MotorCycle();
	}
}
