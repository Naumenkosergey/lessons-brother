package naymchik.lesson2;


import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestItJava02 {
    @Test
    public void testExample1(){
        System.out.println("Проверка первого примера");
        run("2\n4").include("0.2393546309931882");
        run("5\n-1").include("0.26447415176359207");
        run("-3\n-5").include("27.001960872507585");
        run("5\n0").include("-0.2795469591257777");
        run("0\n0").include("0.0");
    }

    @Test
    public void testExample2(){
        System.out.println("Проверка второго примера");
        run("5").include("0.0");
        run("-3").include("0.930");
        run("-5").include("0.933");
        run("8").include("1.8");
    }

    @Test
    public void testExample3(){
        System.out.println("Проверка третьего примера");
        run("5\n-2").include("3,702");
        run("1\n1").include("Infinity");
        run("4\n6").include("63,408");
        run("8\n0").include("0,017");
    }

    @Test
    public void testPerimeterSquareTriangle(){
        System.out.println("Тест прямоугольго треугольника");
        run("3\n4").include("Площадь прямоугольного треугольника со сторонами 3, 4: 6,000.\nПериметр: 12,000");
//        run("3\n4").include("Площадь прямоугольного треугольника со сторонами 3, 4: 6,000.\n" +
//                "Периметр: 12,000");
        run("5\n5").include("Площадь прямоугольного треугольника со сторонами 5, 5: 12,500.\n" +
                "Периметр: 17,071");
        run("6\n8").include("Площадь прямоугольного треугольника со сторонами 6, 8: 24,000.\n" +
                "Периметр: 24,000");
    }

    @Test
    public void testAreaCircle(){
        System.out.println("Тест окружности");
        run("15").include("Площадь круга:  17,905. Длина окружности: 15,0");
        run("10").include("Площадь круга:  7,958. Длина окружности: 10,0");
        run("20").include("Площадь круга:  31,831. Длина окружности: 20,0");
        run("5").include("Площадь круга:  1,989. Длина окружности: 5,0");
    }

    @Test
    public void testDistanceBetweenTwoPoint(){
        System.out.println("Тест на расстояние между точками");
        run("1\n4\n2\n7").include("Расстояние между точками A(1, 4) и B(2, 7): 3,162");
        run("5\n-7\n7\n7").include("Расстояние между точками A(5, -7) и B(7, 7): 14,142");
        run("0\n0\n0\n0").include("Расстояние между точками A(0, 0) и B(0, 0): 0");
        run("0\n-3\n-4\n0").include("Расстояние между точками A(0, -3) и B(-4, 0): 5");
    }

    @Test
    public void testEquilateralTriangle(){
        System.out.println("Тест равностороннего треугольника");
        run("6,2").include("Треугольник со стороной 6,200 имеет:\n" +
                " Высоту 5,369\n" +
                " площадь 16,645\n" +
                " радиус вписанной окружности 1,790\n" +
                "радиус описанной окружности 3,580");
        run("3,465").include("Треугольник со стороной 3,465 имеет:\n" +
                " Высоту 3,001\n" +
                " площадь 5,199\n" +
                " радиус вписанной окружности 1,000\n" +
                "радиус описанной окружности 2,001");
    }

    @Test
    public void testQuadraticEquation(){
        System.out.println("Проверка уравнения");
        run("1\n8\n12").include("Уравнение 1x^2+8x+12 имеет корни x1=-2,00 x2=-6,00");
        run("1\n8\n-9").include("Уравнение 1x^2+8x+-9 имеет корни x1=1,00 x2=-9,00");
        run("1\n8\n5").include("Уравнение 1x^2+8x+5 имеет корни x1=-0,68 x2=-7,32");
    }

    @Test
    public  void testExample4(){
        System.out.println("Пример 4");
        run("5\n2").include("3.9000877550766466");
        run("-3\n5").include("-3.868070142912124");
        run("1\n1").include("-4.941782221533427");

    }

    @Test
    public void testExample5(){
        System.out.println("Пример 5");
        run("5").include("2514.5892427466315");
        run("2").include("8.907025731743182");
        run("154").include("8.60546445226192E10");
        run("7").include("14406.430134012811");
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
    private static TestItJava02 run(String in) {
        return run(in, true);
    }

    private static TestItJava02 run(String in, boolean runMain) {
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
        if (!in.isEmpty()) System.out.println("input:\n" + in);
        System.out.println("---------------------------------------------");
        return new TestItJava02(clName, in, runMain);
    }

    //-------------------------------  тест ----------------------------------------------------------
    public TestItJava02() {
        //Конструктор тестов
    }

    //переменные теста
    private String className;
    private Class<?> aClass;
    private PrintStream oldOut = System.out; //исходный поток вывода
    private PrintStream newOut; //поле для перехвата потока вывода
    private StringWriter strOut = new StringWriter(); //накопитель строки вывода

    //Основной конструктор тестов
    private TestItJava02(String className, String in, boolean runMain) {
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
    private TestItJava02 is(String str) {
        assertTrue("ERROR:Ожидается такой вывод:\n<---начало---->\n" + str + "<---конец--->",
                strOut.toString().equals(str));
        return this;
    }

    private TestItJava02 include(String str) {
        assertTrue("ERROR:Строка не найдена: " + str + "\n", strOut.toString().contains(str));
        return this;
    }

    private TestItJava02 exclude(String str) {
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





