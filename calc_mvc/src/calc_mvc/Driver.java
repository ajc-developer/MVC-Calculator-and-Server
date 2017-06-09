package calc_mvc;

public class Driver {

	static CalculatorWindow cwin;
	static CalcModel cm;
	static CalcController cc;
	public static void main(String[] args) {
		cwin = new CalculatorWindow();
		cc = new CalcController();
		cm = new CalcModel();
		cc.setInputWindow(cwin);
		cwin.setModel(cm);
	}

}
