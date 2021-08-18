package james.leetcode;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("isPalindrome:" + isPalindrome(123456321));
	}

	public static boolean isPalindrome(int x) {
		String temp = String.valueOf(x);
		for (int i = 0; i < temp.length(); i++) {
			if (i > (temp.length() / 2)-1) {
				break;
			}
		
			if (temp.charAt(i) != temp.charAt(temp.length() - (i + 1))) {
				return false;
			}

		}
		return true;

	}
}
