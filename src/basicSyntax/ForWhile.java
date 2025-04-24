package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// 実装1
		int num = 1;
		
		while(num <= 100) {
			System.out.println(num);
				if (num % 3 == 0 && num % ５ == 0) {
					System.out.println("FizzBuzz");
				} else if (num % ５ == 0) {
					System.out.println("Buzz");
				} else if (num % 3 == 0) {
					System.out.println("Fizz");
				}
			num++;
		}
		
		// 実装2
		String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};

		for (String language: languages) {
			System.out.println(language);
			 if (language == "Java") {
				System.out.println("現在学習中の言語はJavaです。");
				 continue;
			 }
			 if (language == "HTML") {
				System.out.println("HTMLはプログラミング言語ではありません。");
				 break;
			 }
		}
	}
}
