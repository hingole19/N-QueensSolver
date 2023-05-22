package com.nqueens;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Output :: " + new NQueensSolver(num).solveNQueensProblem());
		sc.close();
	}
}
