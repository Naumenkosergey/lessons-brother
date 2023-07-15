package naymchik.lesson3;

import java.util.Scanner;

/**
 * 15. Создать класс IharBot, который реализует айчар-бота:
 * Программу спрашивает у пользователя:
 * Какую вы хотите зарплату в $$$?
 * <p>
 * После ввода суммы, программа анализирует полученное значение
 * и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
 * Мы вам перезвоним!
 * <p>
 * Иначе выводит сообщение "Какой месяц вас интересует?"
 * пользователь вводит номер месяца int month бот рассчитанную зарплату.
 * В летние месяцы - выводится введенная сумма с названием месяца.
 * В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
 * в остальные месяцы выводится указанная сумма с премией в 50%.
 * <p>
 * Пример:
 * Какую вы хотите зарплату в $$$?
 * 2000
 * Какой месяц вас интересует?
 * 5
 * За месяц май начислено $3000.0
 */
public class IharBot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("Какую вы хотите зарплату в $$$?");
        double summa = scan.nextDouble();

        if (summa < 300 || summa > 3000) {
            System.out.println("Мы вам перезвоним");
        } else {
            System.out.println("Какой месяц вас интересует?");
        }

        int month = scan.nextInt();



        String d = switch (month) {
            case 1 -> "январь";
            case 2 -> "февраль";
            case 3 -> "март";
            case 4 -> "апрель";
            case 5 -> "май";
            case 6 -> "июнь";
            case 7 -> "июль";
            case 8 -> "август";
            case 9 -> "сентябрь";
            case 10 -> "октябрь";
            case 11 -> "ноябрь";
            case 12 -> "декабрь";
//            default -> "null";
            default -> String.format("За месяц %d начислено $0,00", month);
        };



/** пересмотреть порядок условй*/

        if (month < 1 || month > 12) {
            System.out.println(d);
        } else if (month > 5 && month < 9) {
            System.out.printf("За месяц %s начислено $%.2f", d, summa);
        } else {
            System.out.printf("За месяц %s начислено $%.2f", d, summa * 1.5);
        }


    }


}

