package materials.lesson06;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static org.junit.Assert.*;

@SuppressWarnings("all")

//поставьте курсор на следующую строку и нажмите Ctrl+Shift+F10
public class TestItJava06 {


    @Test
    public void test_modificationArrayMulNumber__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_modificationArrayMulNumber");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static modificationArrayMulNumber", int[].class, int.class);
        System.out.println("Проверка первой модификации массива:");
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        ok.invoke(method, null, arr, 3);
        ok.include("3 6 12 15 18 21 24 27 30 33");

    }

    @Test
    public void test_findAverage__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_findAverage");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static findAverage", int[].class);
        int[] arr = {18, 7, 6, 15, 66, 1, 19, -1, 23};
        double average = (double) ok.invoke(method, null, arr);
        assertEquals("Среднее арифметиское найдено неверно", 17.11111111111111, average, 1e-10);
    }

    @Test
    public void test_modificationGreaterAverager__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_modificationGreaterAverage");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static modificationGreaterAverage", int[].class, int.class, double.class);
        System.out.println("Проверка второй модификации массива:");
        int[] arr = {3, 6, 12, 15, 18, 21, 24, 27, 30, 33};
        ok.invoke(method, null, arr, 3, 18.9);
        ok.include("3 6 12 15 18 24 27 30 33 36 ");
    }

    @Test
    public void testmodificationLessAverage__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_modificationLessAverage");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static modificationLessAverage", int[].class, double.class);
        System.out.println("Проверка третьей модификации массива:");
        int[] arr = {3, 6, 12, 15, 18, 24, 27, 30, 33, 36};
        ok.invoke(method, null, arr, 18.9);
        ok.include("-3 -6 -12 -15 -18 24 27 30 33 36 ");
    }

    @Test
    public void test_findMin__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_findMin");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static findMin", int[].class);
        int[] arr = {18, 7, 6, 15, 1, 19, -1, 23};
        int min = (int) ok.invoke(method, null, arr);
        Arrays.sort(arr);
        assertEquals("Минимум найден неверно", arr[0], min);
    }

    @Test
    public void test_findMax__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_findMax");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static findMax", int[].class);
        int[] arr = {18, 7, 6, 15, 1, 19, -1, 23};
        int max = (int) ok.invoke(method, null, arr);
        Arrays.sort(arr);
        assertEquals("Максимум найден неверно", arr[arr.length - 1], max);
    }

    @Test
    public void test_findMinIndex__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_findMinIndex");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static findMinIndex", int[].class);
        int[] arr = {18, 7, 6, 15, 1, 19, -1, 23};
        int index = (int) ok.invoke(method, null, arr);
        assertEquals("Индекс минимаоьного найден неверно", 6, index);
    }

    @Test
    public void test_findMaxIndex__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_findMaxIndex");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static findMaxIndex", int[].class);
        int[] arr = {18, 7, 6, 15, 66, 1, 19, -1, 23};
        int index = (int) ok.invoke(method, null, arr);
        assertEquals("Индекс максимального найден неверно", 4, index);
    }

    @Test
    public void test_printEven__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_printEven");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static printEven", int[].class);
        System.out.println("Вывод четных:");
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        ok.invoke(method, null, arr);
        ok.include("2 4 6 8 10");
    }

    @Test
    public void test_printOdd__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_printOdd");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static printOdd", int[].class);
        System.out.println("Вывод нечетных:");
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        ok.invoke(method, null, arr);
        ok.include("1 5 7 9 11");
    }

    @Test
    public void test_findElement__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_findElement");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static findElement", int[].class, int.class);
        int[] arr = {18, 7, 6, 15, 66, 1, 19, -1, 23};
        boolean flag = (boolean) ok.invoke(method, null, arr, 15);
        assertEquals("посмотри точнее он есть", true, flag);
        flag = (boolean) ok.invoke(method, null, arr, 150);
        assertEquals("посмотри точнее его нет", false, flag);
    }


    @Test
    public void test_indexElement__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_indexElement");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static indexElement", int[].class, int.class);
        int[] arr = {18, 7, 6, 15, 66, 1, 19, -1, 23};
        int index = (int) ok.invoke(method, null, arr, 15);
        assertEquals("Индекс максимального найден неверно", 3, index);
        index = (int) ok.invoke(method, null, arr, 150);
        assertEquals("Индекс максимального найден неверно", -1, index);
    }


    @Test
    public void test_changeMaxMinElement__ArrayIntCalc() throws Exception {
        System.out.println("\n\nArrayIntCalc_changeMaxMinElement");
        TestItJava06 ok = run("", false);
        Method method = checkMethod(ok.aClass.getSimpleName(), "static changeMaxMinElement", int[].class);
        System.out.println("Проверка смены места:");
        int[] arr = {-3, -6, -12, -15, -18, 24, 27, 30, 33, 36 };
        ok.invoke(method, null, arr);
        ok.include("-3 -6 -12 -15 36 24 27 30 33 -18 ");
    }


    @Test
    public void testRunner() throws Exception {
        System.out.println("\n\nRunner");
        run("10 1 2 4 5 6 7 8 9 10 11 3").include("Исходный массив:\n" +
                "1 2 4 5 6 7 8 9 10 11 \n" +
                "Массив после первого изменения\n" +
                "3 6 12 15 18 21 24 27 30 33 \n" +
                "Среднее арифметическое значение массива: 18.9\n" +
                "Массив после второго изменения\n" +
                "3 6 12 15 18 24 27 30 33 36 \n" +
                "Массив после третьего изменения\n" +
                "-3 -6 -12 -15 -18 24 27 30 33 36 \n" +
                "Минимальный элемент: -18\n" +
                "Максимальный элемент: 36\n" +
                "Индекс минимального элемента: 4\n" +
                "Индекс максимального элемента: 9\n" +
                "Массив после четверного измения изменения\n" +
                "-3 -6 -12 -15 36 24 27 30 33 -18 \n" +
                "Все четные элементы массива: -6 -12 36 24 30 -18 \n" +
                "Все нечетные элементы массива: -3 -15 27 33 \n" +
                "Индекс искомого элемента: -1"
        );

    }

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
    private static TestItJava06 run(String in) {
        return run(in, true);
    }

    private static TestItJava06 run(String in, boolean runMain) {
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
        return new TestItJava06(clName, in, runMain);
    }

    //-------------------------------  тест ----------------------------------------------------------
    public TestItJava06() {
        //Конструктор тестов
    }

    //переменные теста
    private String className;
    private Class<?> aClass;
    private PrintStream oldOut = System.out; //исходный поток вывода
    private PrintStream newOut; //поле для перехвата потока вывода
    private StringWriter strOut = new StringWriter(); //накопитель строки вывода

    //Основной конструктор тестов
    private TestItJava06(String className, String in, boolean runMain) {
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
    private TestItJava06 is(String str) {
        assertTrue("ERROR:Ожидается такой вывод:\n<---начало---->\n" + str + "<---конец--->",
                strOut.toString().equals(str));
        return this;
    }

    private TestItJava06 include(String str) {
        assertTrue("ERROR:Строка не найдена: " + str + "\n", strOut.toString().contains(str));
        return this;
    }

    private TestItJava06 exclude(String str) {
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
