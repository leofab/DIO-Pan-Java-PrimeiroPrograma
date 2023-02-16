package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o primeiro valor:");
		a = scanner.nextInt();
		System.out.println("Digite o segundo valor:");
		b = scanner.nextInt();
		System.out.println("Digite a operação: [1: soma; 2: sub; 3: multi; 4:div]");
		c = scanner.nextInt();
		System.out.println();
		
		switch (c) {
		case 1: {
			
			int soma = soma(a,b);
			System.out.println("Resultado da soma: " + soma);
		}
		case 2: {
			
			int sub = sub(a,b);
			System.out.println("Resultado da subtração: " + sub);
		}
		case 3: {
			
			int multi = multi(a,b);
			System.out.println("Resultado da multiplicação: " + multi);
		}
		case 4: {
			
			int div = div(a,b);
			System.out.println("Resultado da divisão: " + div);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int multi(int a, int b) {
		return a * b;
	}
	public static int div(int a, int b) {
		return a / b;
	}
}
