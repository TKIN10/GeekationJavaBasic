package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		
		int resultAdd = additionMethod(a, b);
		calculationResult(resultAdd);
		
		int resultSub = subtractionMethod(a, b);
		calculationResult(resultSub);
		
		int resultMul = multiplicationMethod(a, b);
		calculationResult(resultMul);
		
		int resultDiv = divisionMethod(a, b);
		calculationResult(resultDiv);
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
	
	public static void calculationResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
}
