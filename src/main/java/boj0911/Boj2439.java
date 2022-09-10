package boj0911;

import java.util.Scanner;

public class Boj2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) { //크게 도는 반복문
			
			for(int j = 1 ; j <= n-i ; j++) { //공백 찍기
				System.out.print(" ");
			}
			
			for(int k = 1 ; k <= i ; k++) { //별은 1부터 i까지
				System.out.print("*"); 
			}
			System.out.println(); //줄바꿈
		}

	}

}
