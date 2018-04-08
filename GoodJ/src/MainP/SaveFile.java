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

			writer.println("=======================\n" + "\nTOTAL AREA: " + Formula.getAllArea() + "\nFREE AREA: "
					+ Formula.getFreeArea());

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
