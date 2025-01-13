<<<<<<< HEAD
package corejavatest.q1.setoperations;

import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 3, 4, 5, 6, 7, 8 };

		int[] arr3 = Union.unionOfArrays(arr1, arr2);

		System.out.println("Arr 1: " + Arrays.toString(arr1));
		System.out.println("Arr 2: " + Arrays.toString(arr2));

		System.out.println("Union : " + Arrays.toString(arr3));
		System.out.println("Intersection : " + Arrays.toString(Intersection.intersectArrays(arr1, arr2)));

	}

}
=======
package corejavatest.q1.setoperations;

import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 3, 4, 5, 6, 7, 8 };

		int[] arr3 = Union.unionOfArrays(arr1, arr2);

		System.out.println("Arr 1: " + Arrays.toString(arr1));
		System.out.println("Arr 2: " + Arrays.toString(arr2));

		System.out.println("Union : " + Arrays.toString(arr3));
		System.out.println("Intersection : " + Arrays.toString(Intersection.intersectArrays(arr1, arr2)));

	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
