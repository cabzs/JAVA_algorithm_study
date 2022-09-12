package boj0912;

import java.util.Scanner;

public class Boj2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n ; i++) { //1부터 n까지
			for(int j = 0; j < n-i; j++) //공백
				System.out.print(" ");
			for(int k = 0; k < (2*i)-1; k++) //별
				System.out.print("*");
			System.out.println();
		}
		
		for(int i = n-1; i >= 0 ; i--) { // n-1번째 줄부터
			for(int j = 0; j < n-i; j++) //공백
				System.out.print(" ");
			for(int k = 0; k < (2*i)-1; k++) //별
				System.out.print("*");
			System.out.println();
		}

	}

}
