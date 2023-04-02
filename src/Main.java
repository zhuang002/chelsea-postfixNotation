import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Double> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		
		for (String token:line) {
			if (isOperator(token)) {
				double d2 = stack.pop();
				double d1 = stack.pop();
				double res = doOperation(token, d1, d2);
				stack.push(res);
			} else {
				double d = Double.parseDouble(token);
				stack.push(d);
			}
		}
		
		System.out.println(stack.pop());
	}

	private static double doOperation(String token, double d1, double d2) {
		// TODO Auto-generated method stub
		if (token.equals("+")) return d1+d2;
		if (token.equals("-")) return d1-d2;
		if (token.equals("*")) return d1*d2;
		if (token.equals("/")) return d1/d2;
		if (token.equals("%")) return d1%d2;
		return Math.pow(d1, d2);
	}

	private static boolean isOperator(String token) {
		// TODO Auto-generated method stub
		return token.equals("+") || token.equals("-") || token.equals("*") 
				|| token.equals("/") || token.equals("%") || token.equals("^");
	}

}
