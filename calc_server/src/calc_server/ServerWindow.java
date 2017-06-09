package calc_server;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ServerWindow extends JFrame{

	private static final long serialVersionUID = 3934503984135545096L;
	JButton b0 = new JButton("Number of Answers");
	JButton b1 = new JButton("Print all Answers");
	JTextArea outputDisplay = new JTextArea();
	JScrollPane scroll = new JScrollPane (outputDisplay, 
			   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	

	
	int spacer = 2;

	ServerWindow() {
		setTitle("CalcServer");
		
		JPanel outPanel = new JPanel(new GridLayout(1, 0, 5, 5));
		outPanel.add(scroll);
		outputDisplay.setEditable(false);
		outputDisplay.setBackground(Color.white);		
		JPanel r0 = new JPanel(new GridLayout(1, 0, 5, 5));
		r0.add(b1);
		r0.add(b0);
		
		// Set up the content pane and add all the panels to it.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 1, 5, 5));
		add(outPanel);
		add(r0);
		setSize(500, 500);
		setVisible(true);
	}

}
