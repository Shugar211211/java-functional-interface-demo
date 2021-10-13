package e04a.calculator.lambda_as_parameter_to_function;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator add = (a, b) -> a+b;
		Calculator subtract = (a, b) -> a-b;
		Calculator multiply = (a, b) -> a*b;
		Calculator divide = (a, b) -> a/b;
		
//		System.out.println("Addition is " + operate(5, 2, add));
//		System.out.println("Subtraction is " + operate(5, 2, subtract));
//		System.out.println("Multiplication is " + operate(5, 2, multiply));
//		System.out.println("Division is " + operate(5, 2, divide));
		
		CalculatorApp calculatorApp = new CalculatorApp();
		System.out.println("Addition is " + calculatorApp.operate(5, 2, add));
		System.out.println("Subtraction is " + calculatorApp.operate(5, 2, subtract));
		System.out.println("Multiplication is " + calculatorApp.operate(5, 2, multiply));
		System.out.println("Division is " + calculatorApp.operate(5, 2, divide));
	}
	
	private double operate(double a, double b, Calculator calculator) {
		return calculator.operation(a, b);
	}
}
