package java_coding_study;

public class Programmers_369게임 {
	class Solution {
	    public int solution(int order) {
	        int answer = 0;
	        String strOrder = "" + order;
	        for (int i = 0; i < strOrder.length(); i++) {
	            char tempChar = strOrder.charAt(i);

	            if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
	                answer++;
	            }
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		int number = 29423;
		Solution s = new Solution();
		System.out.println(s.solution(number));
}
}
