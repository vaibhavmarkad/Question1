package FirstO;

public class Third {
	public static void main(String[] args) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		int[] arr2 = { 5, 3, 1, 2 };
		int n1 = arr1.length + 1;
		int n2 = arr2.length + 1;
		int missingNumber1 = findMissingNumber(arr1, n1);
		int missingNumber2 = findMissingNumber(arr2, n2);
		System.out.println("Missing number in arr1: " + missingNumber1);
		System.out.println("Missing number in arr2: " + missingNumber2);
	}

	public static int findMissingNumber(int[] arr, int n) {
		int sum = n * (n + 1) / 2;
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		return sum - arrSum;
	}

}
