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
public class JTest4 {
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
 * Тестируем метод с входными параметрами 80, 3.5, 7.5 и с предполагаемым результатом 53.75 
 */ 
assertEquals("53.75",formula.PFormula("80", "3.5", "7.5"));
}
}