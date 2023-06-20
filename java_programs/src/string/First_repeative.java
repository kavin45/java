package string;

public class First_repeative {

	public static void main(String[] args) {

		First_repeative obj = new First_repeative();
		String ar = obj.repeative();
		obj.non_repeative(ar);
	}

	public String repeative() {
		String s = "aasse";

		char a[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			boolean flag = false;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flag = true;
				}
			}
			if (flag == true) {
				count++;
				System.out.println("First Repeative element is present here : " + a[i]);
				break;
			}
		}

		if (count == 0) {
			System.out.println("Repeative element is not present here : ");
		}
		return s;
	}

	public void non_repeative(String s) {
		char a[] = s.toCharArray();
		System.out.println();
		boolean flag = false;
		int i;
		for (i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				flag = true;
				System.out.println("first non-repeative element : "
						+ "" + a[i]);
				break;
			}
		}
		if (flag == false) {
		System.out.println("First non-Repeative element not present : ");
		}

	}
}
