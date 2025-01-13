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
}