package com.white;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Xin moi nhap n:");
		int n = sc.nextInt();
		caculate caculate = new caculate(n);
		System.out.print("Day "+ n +" so nguyen to dau tien: ");
		for(int i  = 0; i <= n-1; i++) {
			System.out.print(caculate.a[i] +" ");
		}
	}

}
