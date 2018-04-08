package MainP;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class Formula{

	private Planir plframe;
	private static float FreeArea;
	private static float AllArea;
	
	public Formula(Planir someframe) {
		this.plframe=someframe;
	}
	
	private void Formula(float area,float width, float length) {
		AllArea=area;
		FreeArea=area-width*length;
		if (FreeArea<0)
			FreeArea=0;
		plframe.settextField_3(String.valueOf(FreeArea));
		return;
	
	}
	
	public void getFormula(String area,String width,String length) {
		try {
		Formula(Float.parseFloat(area),Float.parseFloat(width),Float.parseFloat(length));
		}		catch (Exception ep) {
			JOptionPane.showMessageDialog(null, "\nПараметры объекта заполнены неверно!");
		}
	}
	public static float getFreeArea() {
		return FreeArea;
	}
	public static float getAllArea() {
		return AllArea;
	}
	
}
