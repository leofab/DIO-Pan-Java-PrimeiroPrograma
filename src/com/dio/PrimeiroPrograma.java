package com.dio;

import com.dio.module.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		
		Livros livros = new Livros();
		System.out.println(gato);
	}

}

class Livros{
	private String nome;
	private String npag;
}
