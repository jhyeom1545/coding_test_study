package java_coding_study;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        for (int i=0; i<=n; i++){
            for(int j=1;j<=i;j++){
             System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}