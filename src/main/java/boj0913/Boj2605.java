package boj0913;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj2605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt(); //학생의 수
		
		for(int i=0 ; i<n ; i++) {
			int num = sc.nextInt(); //학생들이 뽑은 번호
			
			if(num == 0) {
				list.add(i+1);
			}
			else {
				list.add(list.size()-num, i+1);
			}
		}
		
		for(int i :list)
			System.out.print(i+" ");
	}
}
