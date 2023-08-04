package triangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//double aX, bX, cX, aY, bY, cY;
		
		Triangulo triangleX, triangleY;
		
		triangleX = new Triangulo();
		triangleY = new Triangulo();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os lados do triângulo X:");
		triangleX.sideA = scanner.nextDouble();
		triangleX.sideB = scanner.nextDouble();
		triangleX.sideC = scanner.nextDouble();

		System.out.println("Digite os lados do triângulo Y:");
		triangleY.sideA = scanner.nextDouble();
		triangleY.sideB = scanner.nextDouble();
		triangleY.sideC = scanner.nextDouble();
		
		double areaX = triangleX.area();
		double areaY = triangleY.area();
		
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
