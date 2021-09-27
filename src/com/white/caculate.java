package com.white;

public class caculate {
	int[] a;
	public caculate(int n) {
		a = new int[n];
		a[0] = 2;
		boolean check = true;
		int cout = 2;
		if (n > 1 ) {
		for(int i = 1; i <= n-1; i++) {
			do {
				check = true;
				cout++;
				for(int j = 2; j <= Math.round(Math.sqrt(cout)); j++) {
					if(cout % j == 0) {
						check = false;
					} 
				}
			} while (!(check));
			
			a[i] = cout;
		}
		}
	}
}
