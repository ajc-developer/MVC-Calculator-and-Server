package calc_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;

public class CalcController {
	private CalculatorWindow inputView;
	private State state;

	public CalcController() {
		this.state = new ResetState();
	}

	public void setInputWindow(CalculatorWindow view) {
		inputView = view;

		// Register listeners
		inputView.b0.addActionListener(new zeroListner());
		inputView.b1.addActionListener(new oneListner());
		inputView.b2.addActionListener(new twoListner());
		inputView.b3.addActionListener(new threeListner());
		inputView.b4.addActionListener(new fourListner());
		inputView.b5.addActionListener(new fiveListner());
		inputView.b6.addActionListener(new sixListner());
		inputView.b7.addActionListener(new sevenListner());
		inputView.b8.addActionListener(new eightListner());
		inputView.b9.addActionListener(new nineListner());

		inputView.plus.addActionListener(new addListner());
		inputView.minus.addActionListener(new subListner());
		inputView.mul.addActionListener(new mulListner());
		inputView.div.addActionListener(new divListner());

		inputView.equals.addActionListener(new eqListner());
		inputView.clear.addActionListener(new clearListner());

		System.out.println("Listeners registered in " + this.toString() + " for input window " + inputView.toString());
	}

	public CalculatorWindow getInputWindow() {
		return inputView;
	}

	private class zeroListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "0";
			inputView.outputDisplay.setText(value);
		}
	}

	private class oneListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "1";
			inputView.outputDisplay.setText(value);
		}
	}

	private class twoListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "2";
			inputView.outputDisplay.setText(value);
		}
	}

	private class threeListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "3";
			inputView.outputDisplay.setText(value);
		}
	}

	private class fourListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "4";
			inputView.outputDisplay.setText(value);
		}
	}

	private class fiveListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "5";
			inputView.outputDisplay.setText(value);
		}
	}

	private class sixListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "6";
			inputView.outputDisplay.setText(value);
		}
	}

	private class sevenListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "7";
			inputView.outputDisplay.setText(value);
		}
	}

	private class eightListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "8";
			inputView.outputDisplay.setText(value);
		}
	}

	private class nineListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			value += "9";
			inputView.outputDisplay.setText(value);
		}
	}

	private class addListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			if (!value.endsWith("+ ") && !value.endsWith("- ") && !value.endsWith("* ") && !value.endsWith("/ ")
					&& !value.equals("")) {
				value += " + ";
				inputView.outputDisplay.setText(value);
			}
		}
	}

	private class subListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			if (!value.endsWith("+ ") && !value.endsWith("- ") && !value.endsWith("* ") && !value.endsWith("/ ")
					&& !value.equals("")) {
				value += " - ";
				inputView.outputDisplay.setText(value);
			}
		}
	}

	private class mulListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			if (!value.endsWith("+ ") && !value.endsWith("- ") && !value.endsWith("* ") && !value.endsWith("/ ")
					&& !value.equals("")) {
				value += " * ";
				inputView.outputDisplay.setText(value);
			}
		}
	}

	private class divListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clearErr();
			if (state.inState()) {
				inputView.outputDisplay.setText("");
				state = new ResetState();
			}
			String value = inputView.outputDisplay.getText();
			if (!value.endsWith("+ ") && !value.endsWith("- ") && !value.endsWith("* ") && !value.endsWith("/ ")
					&& !value.equals("")) {
				value += " / ";
				inputView.outputDisplay.setText(value);
			}
		}
	}

	private class eqListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String value = inputView.outputDisplay.getText();
			String completeEqn = null;
			if (value.endsWith("+ ") || value.endsWith("- ") || value.endsWith("* ") || value.endsWith("/ ")) {
				return;
			}
			CalcModel cm = inputView.getModel();
			try {
				String postfix = cm.infixToPostfix(value);
				int calculatedVal = cm.evalPostfix(postfix);
				completeEqn = value + " = " + calculatedVal;
				System.out.println(completeEqn);
				inputView.outputDisplay.setText("" + calculatedVal);
				state = new SuccessfulCalculationState();
				Runnable r = new ServerComThread(completeEqn);
				new Thread(r).start();
			} catch (ArithmeticException ex) {
				inputView.outputDisplay.setText("ERR / by zero");
				ex.printStackTrace();
			} catch (EmptyStackException ex) {
				inputView.outputDisplay.setText("ERR stack exception");
				ex.printStackTrace();
			}
		}
	}

	private class clearListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputView.outputDisplay.setText("");
		}
	}

	private void clearErr() {
		String value = inputView.outputDisplay.getText();
		if (value.contains("ERR")) {
			inputView.outputDisplay.setText("");
		}
	}
}
