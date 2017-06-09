package calc_server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindowController {
	private ServerWindow inputView;

	public ServerWindowController() {
	}

	public void setInputWindow(ServerWindow view) {
		inputView = view;
		
		inputView.b0.addActionListener(new totalAnswers());
		inputView.b1.addActionListener(new allAnswers());

		System.out.println("Listeners registered in "+ this.toString()+" for input window " + inputView.toString());
	}
	
	private class totalAnswers implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputView.outputDisplay.setText("Total Number of questions answered: "+ Driver.eqns.size());
		}
	}
	
	private class allAnswers implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String answers = "List of questions answered:\n";
			for(String s : Driver.eqns){
				answers += s + "\n";
			}
			inputView.outputDisplay.setText(answers);
		}
	}
}
