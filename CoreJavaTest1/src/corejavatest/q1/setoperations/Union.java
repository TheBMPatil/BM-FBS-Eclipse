package corejavatest.q1.setoperations;

public class Union {

	public static int[] unionOfArrays(int[] arr1, int[] arr2) {

		int[] union = new int[arr1.length + arr2.length];
		int unitr = 0;

		for (int i = 0; i < arr1.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < unitr; j++) {
				if (union[j] == arr1[i]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				union[unitr++] = arr1[i];
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < unitr; j++) {
				if (union[j] == arr2[i]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				union[unitr++] = arr2[i];
			}
		}

		return union;

	}

}
