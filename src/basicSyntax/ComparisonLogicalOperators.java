package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		boolean testA = (a > b);
		System.out.println(testA);
		
		String isSunny = "晴れ";
		String isWarm = "暖かい";
		boolean testB = (isSunny == "晴れ" && isWarm == "暖かい");
		System.out.println(testB);
		
		int x = 1;
		int y = 2;
		boolean testC= (x > 0 && y % 2 == 0);
		System.out.println(testC);
		
		boolean hasPermission = !(a == b);
		System.out.println(hasPermission);
	}

}
