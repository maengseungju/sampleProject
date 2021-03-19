package javaEx;

public class lottoEx {

	public static void main(String[] args) {

		int intArray[] = new int[6];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (intArray[i] == intArray[j]) {
					i--;
					break;
				}
			}

		}

		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) {

					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
