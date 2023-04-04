package FirstO;

import java.util.Scanner;

public class Second {
	public static String removingSpaces(String str) {

		int start = 0;

		int end = str.length() - 1;

		while (start < str.length() && str.charAt(start) == ' ') {
			start++;
		}

		while (end >= 0 && str.charAt(end) == ' ') {
			end--;
		}

		return str.substring(start, end + 1);
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");

		String str = sc.nextLine();
		String noSpaces = removingSpaces(str);
		System.out.println(noSpaces);
	}
}
