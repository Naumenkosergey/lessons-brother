package materials.lesson09.noGit;

public class SimpleName {
    public static void main(String[] args) {
        System.out.println(getInitials("Науменко", "Сергей", "Николаевич"));
        System.out.println(getInitials("науменко", "сергей", "николаевич"));
    }

    private static String getInitials(String surname, String name, String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charsSurname = surname.toCharArray();
        char[] charsName = name.toCharArray();
        char[] charsFatherName = fatherName.toCharArray();
        stringBuilder.append(charsSurname[0]).append(".")
                .append(charsName[0]).append(".")
                .append(charsFatherName[0]).append(".");
        return stringBuilder.toString().toUpperCase();
    }
}
