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
public class JTest3 {
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
 * Тестируем метод с входными параметрами 70, 3, 7 и с предполагаемым результатом 49.0
 * для проверки работы программы с целыми числами.
 * Тестируемый метод выполняет расчёт свободной площади в комнате по формуле: Z=S-a*b.
 * Z - Свободная площадь в комнате;
 * S - Вся площадь в комнате;
 * a - Ширина объекта;
 * b - Длина объекта;
 * Предполагается, что программа выполнит следующие расчёты: 70-3*7 и
 * вернёт значение: 49.0.
 */  
assertEquals("49.0",formula.PFormula("70", "3", "7"));
}
}