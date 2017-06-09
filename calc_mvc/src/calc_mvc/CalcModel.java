package calc_mvc;

import java.util.Stack;
import java.util.StringTokenizer;

public class CalcModel {
	static int precedence(char op) {
		switch (op) {
		case '+':
		case '-':
			return 5;
		case '*':
		case '/':
			return 10;
		default:
			throw new IllegalArgumentException("invalid operator");
		}
	}

	public String infixToPostfix(String infix) {
		StringTokenizer tokenizer = new StringTokenizer(infix);
		String postfix = "";
		Stack<Character> opStack = new Stack<Character>();

		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			char c = token.charAt(0);
			if (Character.isDigit(c)) {
				postfix += (token + " ");
			} else {
				while (!opStack.empty()) {
					char top = ((Character) opStack.peek()).charValue();
					if (precedence(top) >= precedence(c)) {
						postfix += (top + " ");
						opStack.pop();
					} else {
						break;
					}
				}

				opStack.push(new Character(c));
			}
		}

		while (!opStack.empty()) {
			char top = ((Character) opStack.pop()).charValue();
			postfix += (top + " ");
		}

		return postfix;
	}

	public int evalPostfix(String postfix) {
		StringTokenizer tokenizer = new StringTokenizer(postfix);
		Stack<Integer> valStack = new Stack<Integer>();

		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			char c = token.charAt(0);
			if (Character.isDigit(c)) {
				valStack.push(new Integer(token));
			} else {
				int rVal = ((Integer) valStack.pop()).intValue();
				int lVal = ((Integer) valStack.pop()).intValue();
				int res;

				switch (c) {
				case '+':
					res = lVal + rVal;
					break;
				case '-':
					res = lVal - rVal;
					break;
				case '*':
					res = lVal * rVal;
					break;
				case '/':
					res = lVal / rVal;
					break;
				default:
					throw new IllegalArgumentException("invalid expression");
				}

				valStack.push(new Integer(res));
			}
		}

		int res = ((Integer) valStack.pop()).intValue();
		if (!valStack.empty()) {
			throw new IllegalArgumentException("invalid postfix expression");
		}

		return res;
	}
}
