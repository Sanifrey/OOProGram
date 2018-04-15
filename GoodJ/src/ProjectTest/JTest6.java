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
public class JTest6 {
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
 * Тестируем метод с входными параметрами 115.5, 5.5, 8.7 и с предполагаемым результатом 67.65 
 */ 
assertEquals("67.65",formula.PFormula("115.5", "5.5", "8.7"));
}
}