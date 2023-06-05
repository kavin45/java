package Simple;

public class Find_age {

	public static void main(String args[]) {
		Find_age obj = new Find_age();
		obj.find();

	}

	public void find() {
		int age = 14;
		// given age is 0 to 10 then print the statement
		if (age > 0 && age <= 10) {
			System.out.println("Given age is childhood : " + age);
		}
		// given age is 11 to 18 then print the statement
		else if (age > 10 && age <= 18) {
			System.out.println("Given age is teenager : " + age);
		}
		// given age is 19 to 35 then print the statement
		else if (age > 18 && age <= 35) {
			System.out.println("Given age is adult : " + age);
		}
		// given age is 36 to 60 then print the statement
		else if (age > 35 && age <= 60) {
			System.out.println("Given age is senior citizen : " + age);
		}
		// given age is 61 to 80 then print the statement
		else if (age > 60 && age <= 80) {
			System.out.println("Given age is  super senior : " + age);
		}
		// age is above 80 then print the statement
		else {
			System.out.println("Please check your age = " + age);
		}
	}
}
