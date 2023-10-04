package JavaSorting;

public class BubleShortAlgorithm {
	public static void BubleShortAlgorithm(int[] a) {
		int n = a.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {3,1,2};
		System.out.println("Array Before Buble Short");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		BubleShortAlgorithm(a);
		System.out.println("Array After Buble Short");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
