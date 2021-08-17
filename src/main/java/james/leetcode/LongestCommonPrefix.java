package james.leetcode;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder result = new StringBuilder();
		for(int i=0;i<strs.length;i++) {
			if(i==0) {
				result.append(strs[i]); 
			}
			else {
				if(result.length()==0) {
					break;
				}
				loop1: for(int j=0;j<result.length();j++) {					
					if(j<strs[i].length()) {					
						if(result.charAt(j)==strs[i].charAt(j)) {
							continue loop1;
						} else {
							if(j==0) {
                                return "";
                            }
							result.delete(j, result.length());
							break;
						}
					} else {
						result.delete(strs[i].length(), result.length());
					}
				}
			}
		}
		
		return result.toString(); 
    }

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
	}
}
