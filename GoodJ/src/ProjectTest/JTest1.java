/** 
* Устанавливаем принадлежность класса к пакету ProjectTest 
*/ 
package ProjectTest;
/** 
* Импортируем библиотеку 
*/ 
import static org.junit.Assert.*;
/** 
* Импортируем библиотеку 
*/ 
import org.junit.Test;
/** 
* Импортируем класс Formula
*/ 
import MainP.Formula;
/** 
* Основной класс 
*/ 
public class JTest1 {
	/** 
	* Объявляем переменную типа Formula 
	*/ 
	private Formula formula;
	/** 
	* Обозначаем , что следующий метод будет тестируемым 
	*/ 
	@Test
	/** 
	* тестируемый метод 
	*/ 
	public void test() {
		/** 
		* Инициализируем переменную formula 
		*/ 
		 formula = new Formula(null);
		 /** 
		 * Тестируем метод с входными параметрами 100, 5, 4 и с предполагаемым результатом 80.0 
		 */ 
		assertEquals("80.0",formula.PFormula("100", "5", "4"));
	}
}
