package LoopStatements;

import java.util.Arrays;

public class AscAndDesc {

	public static void main(String[] args) {
		int i;
		int[] num= {1,2,5,6};
		Arrays.sort(num);
		
		for(int value:num) {
			System.out.println(value);
		}
		System.out.println("Decending Order");
		for(i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		
		
	}

}
