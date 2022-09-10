package boj0911;

import java.util.Scanner;

public class Boj2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<n; i++) { //줄바꿈 5일때
			
			for(int j=n-i ; j<n ; j++) { //공백
				System.out.print(" ");
			}
			
			for(int k=i ; k<n ; k++) { //별찍기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
