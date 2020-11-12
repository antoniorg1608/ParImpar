package es.studium.parImpar;

import java.util.Scanner;

public class parImpar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dame un numero");
		numero = teclado.nextInt();
		if (numero % 2 == 0)
		{
			System.out.println("El numero es PAR");
		} else
		{
			System.out.println("El numero es IMPAR");
		}
		teclado.close();
	}

}
