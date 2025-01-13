<<<<<<< HEAD
package corejavatest.q1.setoperations;

public class Intersection {
	public static int[] intersectArrays(int[] arr1, int[] arr2) {

		int[] intersectionArray = new int[Math.min(arr1.length, arr2.length)];
		int index = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					intersectionArray[index++] = arr1[i];
					break;
				}
			}
		}
		return intersectionArray;
	}
=======
package corejavatest.q1.setoperations;

public class Intersection {
	public static int[] intersectArrays(int[] arr1, int[] arr2) {

		int[] intersectionArray = new int[Math.min(arr1.length, arr2.length)];
		int index = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					intersectionArray[index++] = arr1[i];
					break;
				}
			}
		}
		return intersectionArray;
	}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
}