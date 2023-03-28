package baekjoon.step10001_20000.step14001_15000.step14401_14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 이해
 *		1. 문자열 N개의 집합 S, 검사해야 하는 문자열 수 M
 *  
 */
public class BaekJoon14425_Success {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		String N[] = new String[Integer.parseInt(arr[0])];
		
		for (int i = 0; i < N.length; i++) {
			N[i] = in.readLine();
		}
		
		int count = 0;
		String M = "";
		for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
			M = in.readLine();
			for (int j = 0; j < N.length; j++) {
				count = N[j].equals(M) ? count+1 : count;
			}
		}
		
		System.out.println(count);
		in.close();
	}
}
