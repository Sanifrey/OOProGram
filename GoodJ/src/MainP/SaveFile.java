/**
* Устанавливаем принадлежность класса к пакету
 */
package MainP;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

import javax.swing.JOptionPane;


public class SaveFile {
	
	private void SaveInFile() {
		
		try {
			
			PrintWriter writer = new PrintWriter("Results.txt");
			
			Planir pl = new Planir();
			Formula fl = new Formula(pl);
			
			writer.println("=======================\n"
					+"\nTOTAL AREA: " + fl.getAllArea()+ 
					"\nFREE AREA: " + fl.getFreeArea());
			
			writer.close();
	    	JOptionPane.showMessageDialog(null, "Сохранение выполнено успешно");
		} 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	public void GetSaveInFile() {
		
		SaveInFile();
	}
}
