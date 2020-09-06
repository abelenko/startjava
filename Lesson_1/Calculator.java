public class Calculator {
	public static void main(String[] args) {
		
		// TODO: Калькулятор  + - * / ^ %

		int firstNumber = 2;
		int secondNumber = 10;
		char mathOperation = '^';

		System.out.println(firstNumber + " " + mathOperation + " " + secondNumber + " = ");

		if (mathOperation == '+') {
			System.out.println(firstNumber + secondNumber);
		} else if(mathOperation == '-') {
			System.out.println(firstNumber - secondNumber);
		} else if(mathOperation == '*') {
			System.out.println(firstNumber * secondNumber);
		} else if(mathOperation == '/') {
			System.out.println(firstNumber / secondNumber);
		} else if(mathOperation == '^') {
			if (secondNumber == 0) {
				System.out.println(1);
			}
			int result = 1;
			for(int i = 0; i < secondNumber; i++) {
				result = result * firstNumber;
			}
			System.out.println(result);
		} else if(mathOperation == '%') {
			System.out.println(firstNumber % secondNumber);
			}
	}
}