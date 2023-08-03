package triangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double aX, bX, cX, aY, bY, cY;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os lados do triângulo X:");
		aX = scanner.nextDouble();
		bX = scanner.nextDouble();
		cX = scanner.nextDouble();

		System.out.println("Digite os lados do triângulo Y:");
		aY = scanner.nextDouble();
		bY = scanner.nextDouble();
		cY = scanner.nextDouble();

		double p = (aX + bX + cX) / 2;
		double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));
		
		p = (aY + bY + cY) / 2;
		double areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));
		
		System.out.printf("triangulo X area: %.4f%n", areaX);
		System.out.printf("triangulo Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("O triângulo X tem a maior área");
		}else {
			System.out.println("O triângulo Y tem a maior área");
		}
		
		
		
		scanner.close();

	}

}
