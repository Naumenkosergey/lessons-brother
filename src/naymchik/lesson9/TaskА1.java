package naymchik.lesson9;
/** Создать класс TaskА1.
 В каждом слове текста 4-ю и 7-ю буквы заменить символом #. Для слов короче 4
 символов корректировку не выполнять. Для слов короче 7 символов заменять только 4-ю букву.
 */
public class TaskА1 {
    public static void main(String[] args) {
        String stix = """
                У лукоморья дуб зеленый,
                Златая цепь на дубе том.
                И днём и ночью кот учёный
                Всё ходит по цепи кругом.
                Идёт направо - песнь заводит,
                Налево - сказку говорит.
                Там чудеса: там леший бродит,
                Русалка на ветвях сидит.
                """;
        String [] stixArrya = stix.split("(\n| )");
        for (int i = 0; i < stixArrya.length; i++) {
            System.out.print(stixArrya[i]+" - ");
            System.out.print(stixArrya[i]= String.valueOf(stixArrya[i].length())+" ");
            if (stixArrya[i].length()>7){

            }
        }



    }
}
