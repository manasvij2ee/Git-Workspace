package com.home.array;

public class CombineArrays {

	public static void main(String[] args) {
		String[] a1 = { "a", "b", "c" };
		String[] a2 = { "1", "2", "3" };
		int length = a1.length+ a2.length;
		String[] combined = new String[length];
		
		int x=0; int y=0;
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				combined[i] = a1[x];
				x++;
			} else {
				combined[i] = a2[y];
				y++;
			}
		}
		
		for (int i = 0; i < combined.length; i++) {
			System.out.print(combined[i]);
		}
	}

}