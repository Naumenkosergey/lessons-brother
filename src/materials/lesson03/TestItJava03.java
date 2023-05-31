package materials.lesson03;


import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestItJava03 {
    @Test
    public void testPositiveNegativeNumber() {
        run("2").include("Число положительное");
        run("-115").include("Число отрицательное");
        run("0").include("Число ноль");
    }

    @Test
    public void testConvertNumber() {
        run("5").include("5.0");
        run("-3").include("-3.0");
        run("0").include("0.0");
    }

    @Test
    public void testEqualNumber() {
        run("5\n5\n3").include("5 5");
        run("7\n-7\n2").include("Одинаковых чисел нет");
        run("8\n8\n8").include("8 8 8");
        run("8\n1\n1").include("1 1");
        run("8\n0\n8").include("8 8");
    }

    @Test
    public void testSumOfDigits() {
        run("4587").include("24");
        run("1234").include("10");
        run("4532").include("14");
        run("-4587").include("-24");
        run("-9483").include("-24");
        run("45").include("Число не четырехзначное");


    }

    @Test
    public void testLeapYear() {
        run("2000").include("Високосный");
        run("1100").include("Невисокосный");
        run("1600").include("Високосный");
        run("2020").include("Високосный");
        run("2100").include("Невисокосный");
        run("-2015").include("Год не может быть отрицательным");
    }

    @Test
    public void testDayMonth() {
        run("3\n4").include("Март - четверг");
        run("14\n6").include("Неправильное значение месяца");
        run("11\n9").include("Неправильное значение дня");
        run("17\n10").include("Неправильное значение месяца и дня");
    }

    @Test
    public void testDayMonthModification() {
        run("3\n4").include("Март - четверг");
        run("2\n26").include("Февраль - пятница");
        run("0\n0").include("Декабрь - воскресенье");
        run("4\n651").include("Апрель - воскресенье");
        run("15\n9").include("Март - вторник");
        run("-15\n9").include("Неправильное значение месяца");
        run("15\n-9").include("Неправильное значение дня");
        run("-15\n-9").include("Неправильное значение месяца и дня");
    }

    @Test
    public void testQuadratic() {
        run("1\n8\n12").include("x1=-2,00; x2=-6,00");
        run("2\n8\n8").include("x1=-2,00; x2=-2,00");
        run("7\n6\n5").include("Уравнение не имеет корней");
    }

    @Test
    public void testCheckLastNumber() {
        run("265\n4").include("Цифра 4 не является последней числа 265");
        run("17\n7").include("Цифра 7 является последней числа 17");
        run("-15478\n8").include("Цифра 8 является последней числа -15478");
        run("13\n-3").include("Число к не может быть отрицательным и больше 9");
        run("14513\n13").include("Число к не может быть отрицательным и больше 9");
    }

    @Test
    public void testNumberDayYear() {
        run("3\n3\n2000").include("63");
        run("3\n3\n1999").include("62");
        run("3\n-3\n1999").include("62");
        run("-3\n-3\n-1999").include("62");
        run("3\n3\n1500").include("62");
        run("3\n3\n1600").include("63");
        run("3\n3\n2020").include("63");
        run("18\n1\n2021").include("18");
        run("-18\n1\n-2021").include("18");
    }

    @Test
    public void testCheckingForMultiplicity() {
        run("456\n3").include("Число 456 кратное 3");
        run("-456\n3").include("Число -456 кратное 3");
        run("456\n5").include("Число 456 некратное 5");
        run("155\n5").include("Число 155 кратное 5");
        run("1024\n32").include("Число 1024 кратное 32");
    }

    @Test
    public void testMultiplicationNumbers() {
        run("4\n3").include("четыре умножить на три равно двенадцать");
        run("7\n3").include("семь умножить на три равно двадцать один");
        run("15\n7").include("нужно вводить толко цифры, т.е. значения от 0 до 10");
        run("2\n2").include("два умножить на два равно четыре");
        run("0\n9").include("ноль умножить на девять равно ноль");
    }

    @Test
    public void testPrice() {
        run("5,26").include("5 рублей 26 копеек");
        run("1,02").include("1 рубль 2 копейки");
        run("23,01").include("23 рубля  1 копейка");
        run("75,51").include("75 рублей 51 копейка");
        run("52,51").include("52 рубля 51 копейка");
    }

    @Test
    public void testAgeHuman() {
        run("Sergey\n28").include("Sergey 28 лет");
        run("Petr\n33").include("Petr 33 года");
        run("Kira\n1").include("Kira 1 год");
        run("name\n31").include("name 31 год");
        run("alEx\n24").include("alEx 24 года");
        run("alEx\n113").include("alEx 113 лет");
        run("alEx\n101").include("alEx 101 год");
    }

    @Test
    public void testIharBot() {
        run("3500").include("Мы вам перезвоним");
        run("2000\n5").include("За месяц май начислено $3000,00");
        run("2500\n15").include("За месяц 15 начислено $0,00");
        run("2100\n-1").include("За месяц -1 начислено $0,00");
        run("2100\n8").include("За месяц август начислено $2100,00");
        run("200").include("Мы вам перезвоним");

    }

    /*
    ===========================================================================================================
    НИЖЕ ВСПОМОГАТЕЛЬНЫЙ КОД ТЕСТОВ. НЕ МЕНЯЙТЕ В ЭТОМ ФАЙЛЕ НИЧЕГО.
    Но изучить как он работает - можно, это всегда будет полезно.
    ===========================================================================================================
    */
    //-------------------------------  методы ----------------------------------------------------------


    //метод находит и создает класс для тестирования
    //по имени вызывающего его метода, testTaskA1 будет работать с TaskA1
    private static TestItJava03 run(String in) {
        return run(in, true);
    }

    private static TestItJava03 run(String in, boolean runMain) {
        Throwable t = new Throwable();
        StackTraceElement[] trace = t.getStackTrace();
        StackTraceElement element;
        int i = 0;
        do {
            element = trace[i++];
        }
        while (!element.getMethodName().contains("test"));

        String[] path = element.getClassName().split("\\.");
        String nameTestMethod = element.getMethodName();
        String clName = nameTestMethod.replace("test", "");
        clName = clName.replaceFirst(".+__", "");
        clName = element.getClassName().replace(path[path.length - 1], clName);
        System.out.println("\n---------------------------------------------");
        System.out.println("Старт теста для " + clName);
        if (!in.isEmpty()) System.out.println("input:\n" + in);
        System.out.println("---------------------------------------------");
        return new TestItJava03(clName, in, runMain);
    }

    //-------------------------------  тест ----------------------------------------------------------
    public TestItJava03() {
        //Конструктор тестов
    }

    //переменные теста
    private Class<?> aClass;
    private PrintStream oldOut = System.out; //исходный поток вывода
    private PrintStream newOut; //поле для перехвата потока вывода
    private StringWriter strOut = new StringWriter(); //накопитель строки вывода

    //Основной конструктор тестов
    private TestItJava03(String className, String in, boolean runMain) {

        aClass = null;
        try {
            aClass = Class.forName(className);


        } catch (ClassNotFoundException e) {
            fail("ERROR:Не найден класс " + className + "\n");
        }
        InputStream reader = new ByteArrayInputStream(in.getBytes());
        System.setIn(reader);   //перехват стандартного ввода
        System.setOut(newOut);  //перехват стандартного вывода

        if (runMain) //если нужно запускать, то запустим, иначе оставим только вывод
            try {
                Class[] argTypes = new Class[]{String[].class};
                Method main = aClass.getDeclaredMethod("main", argTypes);
                main.invoke(null, (Object) new String[]{});
                System.setOut(oldOut); //возврат вывода, нужен, только если был запуск
            } catch (Exception x) {
                x.printStackTrace();
            }
    }


    private TestItJava03 include(String str) {
        assertTrue("ERROR:Строка не найдена: " + str + "\n", strOut.toString().contains(str));
        return this;
    }

    //логический блок перехвата вывода
    {
        newOut = new PrintStream(new OutputStream() {
            private byte bytes[] = new byte[1];
            private int pos = 0;

            @Override
            public void write(int b) throws IOException {
                if (pos == 0 && b == '\r') //пропуск \r (чтобы win mac и linux одинаково работали
                    return;
                if (pos == 0) { //определим кодировку https://ru.wikipedia.org/wiki/UTF-8
                    if ((b & 0b11110000) == 0b11110000) bytes = new byte[4];
                    else if ((b & 0b11100000) == 0b11100000) bytes = new byte[3];
                    else if ((b & 0b11000000) == 0b11000000) bytes = new byte[2];
                    else bytes = new byte[1];
                }
                bytes[pos++] = (byte) b;
                if (pos == bytes.length) { //символ готов
                    String s = new String(bytes); //соберем весь символ
                    strOut.append(s); //запомним вывод для теста
                    oldOut.append(s); //копию в обычный вывод
                    pos = 0; //готовим новый символ
                }

            }
        });
    }
}





