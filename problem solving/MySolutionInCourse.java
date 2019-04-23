/*
Java. Базовый курс https://stepik.org/course/187/

*/

/*
В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.
Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно. На самом деле Григорианский календарь был введен значительно позже, но здесь для упрощения мы распространяем его действие на всю нашу эру.
Ввод-вывод обеспечивает проверяющая система. Вам надо только проанализировать переданное в метод значение и вернуть результат. В программу всегда подается положительный номер года. Предполагается решение без циклов. Вам надо придумать и записать несложную формулу, использующую только арифметические операторы.
*/
public static int leapYearCount(int year) {
    return year/4 - year/100 + year/400;
}
/*
Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
Допустимая погрешность – 0.0001 (1E-4)

Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.

В качестве примера написано заведомо неправильное выражение. Исправьте его.
Sample Input:

0.1 0.2 0.3
Sample Output:

true
*/
public static boolean doubleExpression(double a, double b, double c) {
    return Math.abs((a + b) - c) < 0.0001;
}
/*
Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное. Данная задача актуальна, например, при работе с битовыми полями.
Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
Sample Input:
0 1
Sample Output:
1
*/
public static int flipBit(int value, int bitIndex) {
      int c;
	    c = (1 << (bitIndex-1)) ^ value;
    	return c;
}
/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
В качестве примера написано заведомо неправильное выражение. Исправьте его.
*/
public static char charExpression(int a) {
    return (char)('\\' + a);
}
/*
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
Решать можно разными способами:
воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
применив пару трюков из двоичной арифметики;
написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
*/
public static boolean isPowerOfTwo(int value) {
    return (Math.log(Math.abs(value))/Math.log(2))
        %1==0;
}
/*
Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Подсказки (не читайте, если хотите решить сами):

для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]"; найдите в классе String метод, выполняющий замену по регулярному выражению;
для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(), который находится в классе StringBuilder;
в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
Sample Input:

Madam, I'm Adam!
Sample Output:

true
*/
public static boolean isPalindrome(String text) {
    //System.out.println(text);
    String res=text.replaceAll("[^a-zA-Z0-9]",""); // сама замена по регулярке
    //System.out.println(res);
    String test=new StringBuilder(new String(res)).
                            reverse().toString(); //reverse and save
    //System.out.println(test);
    //System.out.println(test.equalsIgnoreCase(res));
    return test.equalsIgnoreCase(res);
}
/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.
Факториал N вычисляется как 1⋅2⋅...⋅N.
Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
*/
public static BigInteger factorial(int value) {
    BigInteger fact=new BigInteger("1"); //int to BigInteger
    int i=0; //count
    while(i<value) 
    {  
      i++;
      fact=fact.multiply(BigInteger.valueOf(i)); //fact * i;
    }
    return fact; 
}
/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
Пример
Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
*/
public static int[] mergeArrays(int[] a1, int[] a2) {
    int[] res = new int[a1.length+a2.length]; //new mass for all elements
    System.arraycopy(a1, 0, res, 0, a1.length); 
    /* cope from "mass->a1, 0 possition to a a1.length" to "mass->res, start from 0 possition"  */
    System.arraycopy(a2, 0, res, a1.length, a2.length);
    /* cope from "mass->a2, 0 possition to a a2.length" to "mass->res, start from a1.length possition"  */
    java.util.Arrays.sort(res); //sort 
    return res; // get result mas[]
}
/*
Вам дан список ролей и сценарий пьесы в виде массива строчек.

Каждая строчка сценария пьесы дана в следующем виде: 
Роль: текст

Текст может содержать любые символы.

Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:

Роль:
i) текст
j) текст2
i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста не учитываются. 
Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно, неправильная сборка результирующей строчки может выйти за ограничение по времени.
Обратите внимание еще на несколько нюансов:
имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
будьте внимательны, не добавляйте лишних пробелов в конце строк.
Sample Input:
roles:
Городничий
Аммос Федорович
Артемий Филиппович
Лука Лукич
textLines:
Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
Аммос Федорович: Как ревизор?
Артемий Филиппович: Как ревизор?
Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
Аммос Федорович: Вот те на!
Артемий Филиппович: Вот не было заботы, так подай!
Лука Лукич: Господи боже! еще и с секретным предписаньем!
Sample Output:
Городничий:
1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.

Аммос Федорович:
2) Как ревизор?
5) Вот те на!

Артемий Филиппович:
3) Как ревизор?
6) Вот не было заботы, так подай!

Лука Лукич:
7) Господи боже! еще и с секретным предписаньем!

*/
private String printTextPerRole(String[] roles, String[] textLines) {
        if ((roles == null) || (textLines == null)) {
            return "";  //если один из параметров null
        }
        int size = roles.length + 1; //max count of roles 
        StringBuilder[] buildArray = new StringBuilder[size];
        /*
          one instance StringBuilder in mass it is comply with one role 
        */
        StringBuilder res = new StringBuilder(); // final res
        for (int i = 0; i < textLines.length; i++) { //we analize  textLines[]
            int j = 0;//counter for all roles mass
            boolean is = false; //flag false-> it is not role, true -> it is role 
            while (j < roles.length) { //foreach all roles
                if (buildArray[j] == null) { StringBuilder for role is not initiation
                    buildArray[j] = new StringBuilder(); //new StringBuilder
                }
                if (textLines[i].startsWith(roles[j] + ":")) { if this string start with concreate role 
                    String buffer=(textLines[i]).replaceFirst(roles[j] + ":",""); // role text with out role name
                    buildArray[j].append("" + (i+1) + ")" + buffer + "\n"); //write to role StringBuilder object to end
                    is = true; //flag is true
                }
                j++; //count ++ (for search next role in current text[i] )
            }
            if (!is) { //if role is not found 
                if (buildArray[size-1] == null) {
                    buildArray[size-1] = new StringBuilder(); //inicialize StringBuilder for not have role
                }
                buildArray[size].append("" + (i+1) + ")" + textLines[i] + "\n");//add to StringBuilder object
            }
        }
        for (int j = 0; j < size; j++) { //foreach, when we building final StringBuilder
			    if(j!=(size-1)) //if is not last, when we add not have role text
            {
                res.append(roles[j]+":\n"); //add role name
            }
            if(buildArray[j]!=null) // if StringBuilder not null
            {
                res.append(buildArray[j]); //add role text
                res.append("\n"); //to next line
            }  
        }
        return res.toString(); //return result
    }

/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)

В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.

Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):

public class Robot {

    public Direction getDirection() {
        // текущее направление взгляда
    }

    public int getX() {
        // текущая координата X
    }

    public int getY() {
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
Direction, направление взгляда робота,  — это перечисление:
public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}


Как это  выглядит:




Пример

В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP

Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:

robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();


P.S. Если вам понравилось это задание, то вам может прийтись по душе игра Robocode, в которой надо написать алгоритм управления танком. Алгоритмы, написанные разными людьми, соревнуются между собой.
*/
public static void moveRobot(Robot robot, int toX, int toY) {
   int x=0,y=0; //save this possitions 
   x=robot.getX();//this possitions of robot on x
   y=robot.getY();//this possitions of robot on y
   int stepX=toX-x;  // how to possitions on x (count)
   int stepY=toY-y;  // how to possitions on y (count)
    
   if (stepY>0) //up
   { getTurn(robot, Direction.UP);
	  for(int i=0; i<stepY;i++)//how more steps
	   {
		   robot.stepForward();//go one step
	   }
   }
   if (stepY<0)//down
   { getTurn(robot, Direction.DOWN);
		for(int i=0; i<Math.abs(stepY);i++)
	   {
		   robot.stepForward();
	   }
   } 
   if (stepX>0)//right
   { getTurn(robot, Direction.RIGHT);
	for(int i=0; i<stepX;i++)
	   {
		   robot.stepForward();
	   }
   }
   if (stepX<0)//left
   { getTurn(robot, Direction.LEFT);
		for(int i=0; i<Math.abs(stepX);i++)
	   {
		   robot.stepForward();
	   }
   }
}

private static void getTurn(Robot robot, Direction dir) // all turn in some method
{
   robot.turnLeft(); 
}
/*
Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().

Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет

Пример

ComplexNumber a = new ComplexNumber(1, 1);
ComplexNumber b = new ComplexNumber(1, 1);
// a.equals(b) must return true
// a.hashCode() must be equal to b.hashCode()

Подсказка 1. Поищите в классе java.lang.Double статический метод, который поможет в решении задачи.
Подсказка 2. Если задача никак не решается, можно позвать на помощь среду разработки, которая умеет сама генерировать equals() и hashCode(). Если вы воспользовались помощью IDE, то разберитесь, что было сгенерировано и почему оно выглядит именно так. Когда вас на собеседовании попросят на бумажке реализовать equals() и hashCode() для какого-нибудь простого класса, то среда разработки помочь не сможет.
*/
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    public boolean equals(Object o)
    {
		if(this==o) return true;//it is one object
		if (o==null) return false;//o it is null
		if(this.getClass()!=o.getClass()) return false;//not support classes
		ComplexNumber ok=(ComplexNumber) o;//convert Object to our class
        return (this.re==ok.getRe())&&(this.im==ok.getIm()); // compare values two objects
    }
	public int hashCode()
	{
		return (int)(31*(re*100)+27*(im*100)); //it is correct hashcode for double values
	}
}
/*
Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых прямоугольников.

Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator. Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.

Интервал интегрирования задается его конечными точками a и b, причем a<=b. Для получения достаточно точного результата используйте шаг сетки не больше 10−6.

Пример. Вызов

integrate(x -> 1, 0, 10)
должен возвращать значение 10.

P.S. Если задача слишком легкая, то дополнительно можете реализовать динамический выбор шага сетки по следующему алгоритму:

Вычислить приближенное значение интеграла функции при начальном значении шага сетки (например, 1).
Вычислить приближенное значение интеграла функции при более мелком шаге сетки (например, уменьшить шаг сетки в два раза).
Если разность двух последовательных приближений интеграла функции достаточно мала, то завершаем алгоритм и возвращаем текущее приближение в качестве результата.
Иначе возвращаемся к шагу 2.
*/
public static double integrate(DoubleUnaryOperator f, double a, double b) {
    int i;
    int n = 1000000; // сколько операций провести для росчетов 
    double result, h;
    result = 0;
    h = (b - a) / n; //Шаг сетки
    for(i = 0; i < n; i++) {
        result += f.applyAsDouble(a + h * (i + 0.5)); //Вычисляем в средней точке,добавляем в сумму 
        /* используя функциональную реализацию */
    }
    result *= h;
    return result;
}
/*
Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(), это метод при передаче отрицательного параметра должен бросать исключение java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?", где вместо вопросика будет подставлено фактически переданное в метод число.
*/
public static double sqrt(double x) {
    if(x<0) throw new IllegalArgumentException("Expected non-negative number, got "+x);
    return Math.sqrt(x); 
}
/*
Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.

Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод, откуда сообщение было залогировано.

Пример

package org.stepic.java.example;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        // ...
    }
}
При запуске эта программа должна вывести:
null
org.stepic.java.example.Test#main
P.S. При тестировании этой программы в среде разработки вы можете получить другой результат: вместо null в первой строчке будет напечатан какой-то посторонний класс и метод. Это связано с тем, что среда разработки обычно запускает не ваш класс, а свой собственный, который затем уже вызывает ваш. Чтобы этого избежать, запускайте программу командой "java" в командной строке.

P.P.S. Эта задача в уроке про исключения не случайно :)
*/
public static String getCallerClassAndMethodName() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    if (stackTraceElements.length <= 3) {
        return null;
    }
    return stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName();
}
/*
Вспомним нашего старого знакомого робота из этой задачи. Теперь мы будем давать роботу команды удаленно, подключаясь к нему по беспроводному каналу связи.

Подключение к роботу представляется в программе интерфейсом RobotConnection:

public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
Да, робот с тех пор поумнел и стал понимать команду на перемещение в заданную точку (метод moveRobotTo). Ему больше не нужны пошаговые инструкции.
RobotConnection — это временно устанавливаемое соединение, которое надо закрывать, когда оно больше не нужно. Для закрытия соединения в интерфейсе есть метод close().

За установку соединения отвечает RobotConnectionManager:

public interface RobotConnectionManager {
    RobotConnection getConnection();
}
Метод getConnection() делает попытку соединиться с роботом и возвращает установленное соединение, через которое можно отдавать роботу команды.
Установка соединения может завершиться неуспешно, а также уже установленное соединение может внезапно разорваться. Всякое бывает. Поэтому любой метод RobotConnectionManager и RobotConnection может бросить непроверяемое исключение RobotConnectionException:

public class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
Ваша задача — реализовать метод который устанавливает соединение с роботом, отдает ему команду на перемещение в заданную точку и затем закрывает соединение, выполняя при необходимости повтор этой последовательности до трех раз.

При этом:

Попытка отдать команду роботу считается успешной, если удалось установить соединение и выполнить метод RobotConnection.moveRobotTo() без исключений. Ошибка закрытия соединения не важна и должна игнорироваться.
Если первая попытка подключиться и отдать команду оказалась неуспешной, то закрываем соединение и выполняем вторую попытку. Если вторая тоже не удалась, то выполняется третья. После третьей неудачи метод должен бросить исключение RobotConnectionException.
Метод отвечает за открытие и закрытие соединения. Если соединение удалось установить, то оно обязательно должно быть закрыто несмотря на возможные исключения, случившиеся в дальнейшем во время работы метода.
Если во время работы метода случилось исключение любого типа, отличного от RobotConnectionException, метод должен завершиться и выбросить это исключение, не выполняя повторных попыток пообщаться с роботом. Единственное, что метод должен сделать перед выбросом этого исключения — закрыть открытое соединение RobotConnection.
*/
public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
    boolean fNotConn=false;//flag is connected? 
    for(int i=0;!fNotConn && (i < 3);i++) // foreach (3 points) when success==false
    {    try(RobotConnection rc=robotConnectionManager.getConnection()) //  this code may be throw exceptins + conne
         //get connectionr
            {
            rc.moveRobotTo(toX, toY); //work with connected sistem
            fNotConn=true; // if connected is OK , flag -> true
         }
        catch(RobotConnectionException ex){} //processing exception of this type 
        //catch(Exception ex) { throw ex; }
    }
    if(!fNotConn) throw new RobotConnectionException(""); //flag is false(we do not connected) -> create and throw exception
}

/*

*/
