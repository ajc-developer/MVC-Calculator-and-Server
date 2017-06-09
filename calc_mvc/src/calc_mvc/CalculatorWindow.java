package calc_mvc;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorWindow extends JFrame {
	private static final long serialVersionUID = 3190298281032260770L;
	
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton mul = new JButton("*");
	JButton div = new JButton("/");
	
	JButton equals = new JButton("=");
	JButton clear = new JButton("C");
	JTextField outputDisplay = new JTextField();
	
	int spacer = 2;

	private CalcModel model;
	

	CalculatorWindow() {
		setTitle("Calculator");
		
		JPanel outPanel = new JPanel(new GridLayout(1, 0, 5, 5));
		outPanel.add(outputDisplay);
		outputDisplay.setEditable(false);
		outputDisplay.setBackground(Color.white);
		outputDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel r0 = new JPanel(new GridLayout(1, 0, 5, 5));
		r0.add(b7);
		r0.add(b8);
		r0.add(b9);
		r0.add(Box.createHorizontalStrut(spacer));
		r0.add(plus);
		
		JPanel r1 = new JPanel(new GridLayout(1, 0, 5, 5));
		r1.add(b4);
		r1.add(b5);
		r1.add(b6);
		r1.add(Box.createHorizontalStrut(spacer));
		r1.add(minus);
		
		JPanel r2 = new JPanel(new GridLayout(1, 0, 5, 5));
		r2.add(b1);
		r2.add(b2);
		r2.add(b3);
		r2.add(Box.createHorizontalStrut(spacer));
		r2.add(mul);
		
		JPanel r3 = new JPanel(new GridLayout(1, 0, 5, 5));
		r3.add(b0);
		r3.add(equals);
		r3.add(clear);
		r3.add(Box.createHorizontalStrut(spacer));
		r3.add(div);
		
		// Set up the content pane and add all the panels to it.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 1, 5, 5));
		add(outPanel);
		add(r0);
		add(r1);
		add(r2);
		add(r3);
		pack();
		setVisible(true);
	}


	public void setModel(CalcModel cm) {
		this.model = cm;
	}
	public CalcModel getModel() {
		return this.model;
	}
	
}