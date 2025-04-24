package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		calculationResult(a, b);
	}
	
	public static int additionMethod(int a, int b) {
		return a + b;
	}
	
	public static int subtractionMethod(int a, int b) {
		return a - b;
	}
	
	public static int multiplicationMethod(int a, int b) {
		return a * b;
	}
	
	public static int divisionMethod(int a, int b) {
		return a / b;
	}
	
	public static void calculationResult(int a, int b) {
		System.out.println("計算結果は" + additionMethod(a, b) + "です。");
		System.out.println("計算結果は" + subtractionMethod(a, b) + "です。");
		System.out.println("計算結果は" + multiplicationMethod(a, b) + "です。");
		System.out.println("計算結果は" + divisionMethod(a, b) + "です。");
	}
}
