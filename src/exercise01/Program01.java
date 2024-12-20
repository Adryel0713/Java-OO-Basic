package exercise01;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {

	/*
		Fazer um programa para ler os valores da largura e altura
		de um retângulo. Em seguida, mostrar na tela o valor de
		sua área, perímetro e diagonal. Usar uma classe como
		mostrado no projeto ao lado.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		double width = s.nextDouble();
		double height = s.nextDouble();
		
		Rectangle rectangle = new Rectangle(width, height);
		
		System.out.printf("AREA = %.2f\n",rectangle.Area());
		System.out.printf("PERIMETER = %.2f\n",rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f\n",rectangle.Diagonal());

		
		s.close();
	}

}
