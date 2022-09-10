package boj0911;

import java.util.Scanner;

public class Boj2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++) { //1,2,3, ... n
			for(int j=i; j<=n; j++) {//1,2,3,4,... n+1
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
