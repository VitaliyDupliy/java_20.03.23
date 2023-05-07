package ua.hillel.hw10;

public class ValueCalculator {

	private float[] array = new float[20000000];
	private int arrayLength = array.length;
	private int halfArray = array.length / 2;

	public void arrayManipulation() throws InterruptedException {
		long start = System.currentTimeMillis();

		// Set 1.0 to all values of an array:
		for (int i = 0; i < arrayLength; i++) {
			array[i] = 1;
		}
		// Create two new arrays
		float[] firstArray = new float[halfArray];
		float[] secondArray = new float[halfArray];

		// Copying elements from array to halfArrays:
		System.arraycopy(array, 0, firstArray, 0, halfArray);
		System.arraycopy(array, halfArray, secondArray, 0, halfArray);

		// Fill halfArrays
		new Thread(() -> loadArray(firstArray)).start();
		new Thread(() -> loadArray(firstArray)).join();
		

		new Thread(() -> loadArray(secondArray)).start();
		new Thread(() -> loadArray(secondArray)).join();
		

		System.arraycopy(firstArray, 0, array, 0, halfArray);

		System.arraycopy(secondArray, 0, array, halfArray, halfArray);

		long end = System.currentTimeMillis();
		long operationTime = (end - start);

		System.out.println("operationTime = " + operationTime + " millisec.");

	}

	public void loadArray(float[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
			;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ValueCalculator vc = new ValueCalculator();
		vc.arrayManipulation();

	}

}
