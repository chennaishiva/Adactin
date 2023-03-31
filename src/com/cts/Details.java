package com.cts;

public class Details {

	public static void main(String[] args) {

		int f = 0;
		int s = 1;

		// System.out.println(n1);
		// System.out.println(n2);

		for (int i = 0; i <= 10; i++) {

			System.out.println(f);
			int t = f + s;
			f = s;
			s = t;

		}

	}
}
