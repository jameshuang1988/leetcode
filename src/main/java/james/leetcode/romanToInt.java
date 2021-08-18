package james.leetcode;

import java.util.HashMap;

public class romanToInt {
	public static int romanToInt(String s) {
		HashMap<String, Integer> word = new HashMap<String, Integer>();
		word.put("I", 1);
		word.put("V", 5);
		word.put("X", 10);
		word.put("L", 50);
		word.put("C", 100);
		word.put("D", 500);
		word.put("M", 1000);
		int result = 0;
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			if (word.containsKey(Character.toString(s.charAt(i)))) {
				if (temp == 0) {
					temp = word.get(Character.toString(s.charAt(i)));
					if(i==s.length()-1) {
						result = result +  word.get(Character.toString(s.charAt(i)));
					} 
				} else {
					if (temp >= word.get(Character.toString(s.charAt(i)))) {
						result = result + temp;
						if(i==s.length()-1) {
							result = result +  word.get(Character.toString(s.charAt(i)));
						} else {
							temp = word.get(Character.toString(s.charAt(i)));
						}
					} else {
						result = result + word.get(Character.toString(s.charAt(i))) - temp;
						temp = 0;
					}
				}

			} else {
				return 0;
			}
		}
		return result;

	}
	
	public static int romanToIntfast(String s) {		 
        int res=0;
        int a=getVal(s.charAt(0));
        for(int i=1; i<s.length();i++){
            int b=getVal(s.charAt(i));
            if(a<b){
               res=res-a;
            }
            else{
                res=res+a;
            }
            a=b;
        }
         res += a;
         return res;
	}
	private static int getVal(char c){
        switch(c){
            case 'I':
                return 1;
             case 'V':
                return 5;
             case 'X':
                return 10;
             case 'L':
                return 50;
             case 'C':
                return 100;
             case 'D':
                return 500;
             case 'M':
                return 1000;
            default:
                return 0;
        }
    }
	public static void main(String[] args) {
		System.out.println(romanToIntfast("MDCXCV"));
		
	}
}
