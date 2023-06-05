package Simple;

public class Return_value {

	public static void main(String args[]) {
		Return_value object = new Return_value();
		int answer = object.addition();
		object.discount(answer);
	}

	public int addition() {
		int first = 5;
		int second = 10;
		int total = first + second;
		System.out.println("First value is: " + first);
		System.out.println("Second value is: " + second);
		System.out.println("the addition output is " + total);
		return total;
	}

	public void discount(int answer) {
		int finalAnswer = answer - 5;
		System.out.println("pls pay : " + finalAnswer);

	}

}
