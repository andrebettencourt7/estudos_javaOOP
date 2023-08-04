package triangulo;

public class Triangulo {

		public double sideA;
		public double sideB;
		public double sideC;
		
		public double area() {
			double p = (sideA + sideB + sideC) / 2;
			return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

		}
}
