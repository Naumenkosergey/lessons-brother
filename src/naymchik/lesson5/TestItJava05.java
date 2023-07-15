package naymchik.lesson5;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@SuppressWarnings("all")

//поставьте курсор на следующую строку и нажмите Ctrl+Shift+F10
public class TestItJava05 {

    @Test
    public void testPrintNumber() throws Exception {
        System.out.println("\n\nПроверка printNumberFromZeroToTenInclude");
        checkMethod("PrintNumber", "static printNumberFromZeroToTenInclude", int.class);
        run("10 0 0").include("1 2 3 4 5 6 7 8 9 10");
        run("5 0 0").include("1 2 3 4 5");
        System.out.println("\n\nПроверка printNumberFromZeroToTenInclude");
        checkMethod("PrintNumber", "static printNumberFromTenToZeroExclude", int.class);
        run("15 0 0").include("15 14 13 12 11 10 9 8 7 6 5 4 3 2 1");
        run("3 0 0").include("3 2 1");
        System.out.println("\n\nПроверка printNumberFromNToKStep");
        checkMethod("PrintNumber", "static printNumberFromNToKStep", int.class, int.class, int.class);
        run("5 15 3").include("5 8 11 14");
        run("5 17 3").include("5 8 11 14 17");
        run("-17 27 7").include("-17 -10 -3 4 11 18 25");
    }

    @Test
    public void testCalcNumber() throws Exception {
        System.out.println("\n\nCalcNumber");
        checkMethod("CalcNumber", "static sumSequence", int.class, int.class);
        run("4 15").include("Сумма: 114");
        checkMethod("CalcNumber", "static mulSequence", int.class, int.class);
        run("4 15").include("Произведение: 1644813312");
        checkMethod("CalcNumber", "static factorial", int.class);
        run("4 15").include("4! = 24");
        checkMethod("CalcNumber", "static sumEven", int.class, int.class);
        run("4 15").include("Сумма четных: 54");
        checkMethod("CalcNumber", "static sumOdd", int.class, int.class);
        run("4 15").include("Сумма нечетных: 60");

    }

    @Test
    public void testSimpleNumber() {
        System.out.println("\n\nSimpleNumber");
        run("-12").include("Число -12 составное");
        run("12").include("Число 12 составное");
        run("121").include("Число 121 составное");
        run("-113").include("Число -113 простое");
    }

//    @Test
//    public  void testPrintNumber_NumberFromZeroToTenInclude() throws Exception {
//        System.out.println("\n\nПроверка printNumberFromZeroToTenInclude");
//        TestItJava05 ok = run("", false);
//        Method method = checkMethod(ok.aClass.getSimpleName(), "static printNumberFromZeroToTenInclude", int.class);
//        method.invoke();
//    }


    /*
===========================================================================================================
НИЖЕ ВСПОМОГАТЕЛЬНЫЙ КОД ТЕСТОВ. НЕ МЕНЯЙТЕ В ЭТОМ ФАЙЛЕ НИЧЕГО.
Но изучить как он работает - можно, это всегда будет полезно.
===========================================================================================================
 */
    //-------------------------------  методы ----------------------------------------------------------
    private Class findClass(String SimpleName) {
        String full = this.getClass().getName();
        String dogPath = full.replace(this.getClass().getSimpleName(), SimpleName);
        try {
            return Class.forName(dogPath);
        } catch (ClassNotFoundException e) {
            fail("\nERROR:Тест не пройден. Класс " + SimpleName + " не найден.");
        }
        return null;
    }

    private Method checkMethod(String className, String methodName, Class<?>... parameters) throws Exception {
        Class aClass = this.findClass(className);
        try {
            methodName = methodName.trim();
            Method m;
            if (methodName.startsWith("static")) {
                methodName = methodName.replace("static", "").trim();
                m = aClass.getDeclaredMethod(methodName, parameters);
                if ((m.getModifiers() & Modifier.STATIC) != Modifier.STATIC) {
                    fail("\nERROR:Метод " + m.getName() + " должен быть статическим");
                }
            } else
                m = aClass.getDeclaredMethod(methodName, parameters);
            m.setAccessible(true);
            return m;

        } catch (NoSuchMethodException e) {
            System.err.println("\nERROR:Не найден метод " + methodName + " либо у него неверная сигнатура");
            System.err.println("ERROR:Ожидаемый класс: " + className);
            System.err.println("ERROR:Ожидаемый метод: " + methodName);
            return null;
        }
    }

    private Method findMethod(Class<?> cl, String name, Class... param) {
        try {
            return cl.getDeclaredMethod(name, param);
        } catch (NoSuchMethodException e) {
            fail("\nERROR:Тест не пройден. Метод " + cl.getName() + "." + name + " не найден\n");
        }
        return null;
    }

    private Object invoke(Method method, Object o, Object... value) {
        try {
            method.setAccessible(true);
            return method.invoke(o, value);
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("\nERROR:Не удалось вызвать метод " + method.getName() + "\n");
        }
        return null;
    }


    //метод находит и создает класс для тестирования
    //по имени вызывающего его метода, testTaskA1 будет работать с TaskA1
    private static TestItJava05 run(String in) {
        return run(in, true);
    }

    private static TestItJava05 run(String in, boolean runMain) {
        Throwable t = new Throwable();
        StackTraceElement trace[] = t.getStackTrace();
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
        if (!in.isEmpty()) System.out.println("input:" + in);
        System.out.println("---------------------------------------------");
        return new TestItJava05(clName, in, runMain);
    }

    //-------------------------------  тест ----------------------------------------------------------
    public TestItJava05() {
        //Конструктор тестов
    }

    //переменные теста
    private String className;
    private Class<?> aClass;
    private PrintStream oldOut = System.out; //исходный поток вывода
    private PrintStream newOut; //поле для перехвата потока вывода
    private StringWriter strOut = new StringWriter(); //накопитель строки вывода

    //Основной конструктор тестов
    private TestItJava05(String className, String in, boolean runMain) {
        //this.className = className;
        aClass = null;
        try {
            aClass = Class.forName(className);
            this.className = className;

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

    //проверка вывода
    private TestItJava05 is(String str) {
        assertTrue("ERROR:Ожидается такой вывод:\n<---начало---->\n" + str + "<---конец--->",
                strOut.toString().equals(str));
        return this;
    }

    private TestItJava05 include(String str) {
        assertTrue("ERROR:Строка не найдена: " + str + "\n", strOut.toString().contains(str));
        return this;
    }

    private TestItJava05 exclude(String str) {
        assertTrue("ERROR:Лишние данные в выводе: " + str + "\n", !strOut.toString().contains(str));
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
