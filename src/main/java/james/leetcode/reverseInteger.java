package james.leetcode;

import javax.print.attribute.IntegerSyntax;

public class reverseInteger {
	public static int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;
			if (x != 0 && Math.abs(rev) > Integer.MAX_VALUE / 10) {
				return 0;
			}
		}
		return rev;
	}

	public static void main(String[] args) {
		try {
			System.out.println(reverse(-1234569870));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
