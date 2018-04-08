/**
 * Устанавливаем принадлежность класса к пакету
 */
package MainP;
/**
* Подключаем библиотеку для работы с диалоговыми окнами
 */
import javax.swing.JOptionPane;
/**
 * Объявляем класс с модификатором public
 */
public class Formula {
	/**
	 * Экземпляр класса Planir
	 */
	private Planir plframe;
	/**
	 * Объявляем приватные статические переменные.
	 * FreeArea - значение свободной площади в комнате. 
	 * AllArea - значение всей площади комнаты.
	 */
	private static float FreeArea;
	private static float AllArea;
	/**
	 * Вызываем конструктор
	 */
	public Formula(Planir someframe) {
		this.plframe = someframe;
	}
	/**
	 * Приватный метод для расчёта свободной площади в комнате
	 */
	private void FormulaFree(float area, float width, float length) {
		/**
		 * Присваиваем переменной AllArea значение переменной area
		 */
		AllArea = area;
		/**
		 * Выполняем расчёт свободной площади в комнате
		 */
		FreeArea = area - width * length;
		/**
		 * Если значение свободной площади(FreeArea) в комнате меньше нуля(что является
		 * логической ошибкой), то присваиваем значение свободной площади(FreeArea) к
		 * нулю.
		 */
		if (FreeArea < 0)
			FreeArea = 0;
		/**
		 * Вызываем метод FillTextField_3 для заполнения в форме планировщик поля
		 * textField_3 значением FreeArea
		 */
		FillTextField_3(FreeArea);
	}
	/**
	 * Публичный метод(Геттер) для вызова приватного метода FormulaFree.
	 */
	public void getFormula(String area, String width, String length) {
		/**
		 * Выполняем отслеживание блока кода, где может произойти ошибка, при помощи
		 * исключения try
		 */
		try {
			FormulaFree(Float.parseFloat(area), Float.parseFloat(width), Float.parseFloat(length));
		}
		/**
		 * Исключение catch
		 */
		catch (Exception ep) {
			/**
			 * Обрабатываем исключение типа "Exception e" и показываем диалоговое окно
			 */
			JOptionPane.showMessageDialog(null, "\nПараметры объекта заполнены неверно!");
		}
	}
	/**
	 * Метод для заполнения в форме планировщик поля textField_3 значением FreeArea
	 */
	private void FillTextField_3(float FreeArea) {
		plframe.settextField_3(String.valueOf(FreeArea));
	}
	/**
	 * Публичный метод(Геттер) для получения значения свободной площади в комнате.
	 */
	public static float getFreeArea() {
		return FreeArea;
	}
	/**
	 * Публичный метод(Геттер) для получения значения всей площади в комнате.
	 */
	public static float getAllArea() {
		return AllArea;
	}
}
