package algorithm_100.Basic_002;

import java.util.Scanner;

// 피보나치 수열
// An = An-1 + An-2
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("어디까지 더할까요?");
		int num = sc.nextInt();
		
		int[] arr = new int[num+1];
		arr[1] = 1;
		arr[2] = 1;
		
		for (int i = 3; i <= num; i++) {
			arr[i] =  arr[i-1] + arr[i-2];
		}
		
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		// 2번째 방법
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1+ " ");
		System.out.print(num2+ " ");
		for (int i = 3; i <num+1; i++) {
			
			int nNum = num1+num2;
			System.out.print(nNum+ " ");
			
			num2 = num1;
			num1 = nNum;
		}
		
		
	}
}
