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
public class JTest7 {
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
 * Тестируем метод с входными параметрами 95.5, 8.5, 9 и с предполагаемым результатом 19.0 
 */ 
assertEquals("19.0",formula.PFormula("95.5", "8.5", "9"));
}
}