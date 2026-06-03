package LoopStatements;

import java.util.Arrays;

public class AscAndDesc {

	public static void main(String[] args) {
		int[] num= {1,2,5,6};
		Arrays.sort(num);
		
		for(int value:num) {
			System.out.println(value);
		}
		
		
	}

}
