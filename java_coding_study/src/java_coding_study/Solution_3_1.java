package java_coding_study;

public class Solution_3_1 {
	public static void main(String[] args) {
		int coin = 1260;
		int count = 0;
		
		int[] coinType = {500, 100, 50, 10};
		for(int i =0; i< 4; i++) {
			count += coin / coinType[i];
			coin %= coinType[i];
		}
		System.out.println("count : " + count);
	}
}
