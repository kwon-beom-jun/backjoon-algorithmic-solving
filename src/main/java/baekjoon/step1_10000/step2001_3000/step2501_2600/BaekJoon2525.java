package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2525 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] time = reader.readLine().split(" ");
		int add = Integer.parseInt(reader.readLine());
		
		System.out.println(
		Integer.parseInt(time[1]) + add >= 60 ? 
				Integer.parseInt(time[0]) + (Integer.parseInt(time[1]) + add)/60 >= 24 ? 
						(Integer.parseInt(time[0]) + (Integer.parseInt(time[1]) + add)/60 - 24) + " " + (Integer.parseInt(time[1]) + add)%60 : 
						(Integer.parseInt(time[0]) + (Integer.parseInt(time[1]) + add)/60) + " " + (Integer.parseInt(time[1]) + add)%60
			: 	time[0] + " " + (Integer.parseInt(time[1]) + add)
		);
		
	}
}
