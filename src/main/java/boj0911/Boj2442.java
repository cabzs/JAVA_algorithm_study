package boj0911;

import java.util.Scanner;

public class Boj2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// n-1까지
		// 1 3 5 7 9 
		for(int i=1 ; i<=n ; i++) { 
			for(int j=1 ; j<=n-i ; j++ ) { //공백
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
