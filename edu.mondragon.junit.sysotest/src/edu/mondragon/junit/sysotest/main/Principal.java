package edu.mondragon.junit.sysotest.main;

import java.util.Scanner;

public class Principal {
	
	public static void suma() {
		Scanner scanner = new Scanner(System.in);
		int primerSumando = scanner.nextInt();
		int segundoSumando = scanner.nextInt();
		System.out.print(primerSumando+segundoSumando);
	}

}