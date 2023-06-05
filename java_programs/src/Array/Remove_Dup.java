package Array;

public class Remove_Dup {

	public static void main(String args[]) {
		Remove_Dup obj = new Remove_Dup();
		obj.remove();
	}

	public void remove() {
		int a[] = { 1, 2, 3, 1, 3, 1, 4 };


		System.out.println("Before array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int value = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			for (int j = i +1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = value;
				}

			}
		}

		System.out.println("After array");
		for (int i = 0; i < a.length; i++) {
     		if (a[i] != value) {
				System.out.println(a[i]);
			}
		}

	}

}
