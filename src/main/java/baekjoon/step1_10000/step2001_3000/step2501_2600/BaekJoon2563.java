package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 가로, 세로 크기 100인 정사각형 도화지를 이용
 *  
 */
public class BaekJoon2563 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int arr[][] = new int[100][100];
		String xy[];  
		int x, y, count = 0;
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num; i++) {
			xy = in.readLine().split(" ");
			x = Integer.parseInt(xy[0]); 
			y = Integer.parseInt(xy[1]);
			
			for (int j = 0; j < 10; j++) {
				for (int z = 0; z < 10; z++) {
					if (arr[x+j][y+z] == 0) {
						arr[x+j][y+z] = 1;
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}