package algorithm_100.Basic_003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		1 2 2 3 1 4 2 2 4 3 5 3 2
		Scanner scan = new Scanner(System.in);
		int[] inputNum = new int[13];
		for (int i = 0; i <inputNum.length; i++) {
			inputNum[i] = scan.nextInt();
		}
		System.out.println(inputNum.length);

		int[] mode = new int [inputNum.length];
		for (int i = 0; i < inputNum.length; i++) {
			mode[inputNum[i]]++;	
		}
		
		int modeNum = 0;
		int modeCnt = 0;
		for (int i = 0; i < inputNum.length; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		
		for (int i = 0; i < inputNum.length; i++) {
			System.out.println("mode["+i+"]: "+mode[i]+"회 출현");
		}
		
		System.out.println("최빈수: "+ modeNum);
		System.out.println("최빈수의 횟수: "+ modeCnt);
		
	}
}
