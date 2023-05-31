package materials.lesson13.nogit;

public class Matrix extends Var {

    private double[][] value;

    public Matrix(double[][] value) {
        this.value = value;
    }

    public Matrix(Matrix matrix) {
        value = matrix.value;
    }

    public Matrix(String value) {

        String[] split = value.trim().split("(},\\s*\\{)");
        int countRow = split.length;
        int countCol = split[0].split("\\s*,\\s*").length;
        double[][] arr = new double[countRow][countCol];

        for (int i = 0; i < countRow; i++) {
            split[i] = split[i].replaceAll("[{}]", "");
            String[] splitRow = split[i].split("\\s*,\\s*");
            for (int j = 0; j < splitRow.length; j++) {
                arr[i][j] = Double.parseDouble(splitRow[j]);
            }
        }
        this.value = arr;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{{");
        for (int i = 0; i < value.length; i++) {
            String del = "";
            String delRow = i != value.length - 1 ? "}, {" : "";
            for (int j = 0; j < value[i].length; j++) {
                stringBuilder.append(del).append(value[i][j]);
                del = ", ";
            }
            stringBuilder.append(delRow);
        }
        stringBuilder.append("}}");

        return stringBuilder.toString();
    }
}
