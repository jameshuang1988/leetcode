package james.leetcode;

import java.util.HashMap;

public class twoSum {
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
		 for(int i = 0;i< nums.length;i++) {
			 if(temp.containsKey(target-nums[i])) {
				 return(new int[] {temp.get(target-nums[i]),i});
			 }
			 temp.put(nums[i], i);
			 System.out.println(temp);
		 }
		 return nums;
	        
	 }
	 
	 public static void main(String args[]) {
		int result[] = twoSum(new int[]{-1,5,3,2},2);
		System.out.println(result[0] + " --- " + result[1]);
	 }
}
