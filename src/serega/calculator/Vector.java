package serega.calculator;

import java.util.Arrays;

public class Vector extends Var implements Operation{

    private double[] values;

    public Vector() {
    }

    public Vector(double[] values) {
        this.values = values;
    }

    public Vector(Vector vector) {
        this.values = vector.getValues();
    }

    public Vector(String text) {
        String[] stringValues = text.substring(1, text.length() - 1).split(",");
        values = new double[stringValues.length];
        for (int i = 0; i < stringValues.length; i++) {
            values[i] = Double.parseDouble(stringValues[i]);
        }
    }

    public double[] getValues() {
        return values;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            Scalar otherScalar = (Scalar) other;
            for (int i = 0; i < values.length; i++) {
                values[i] += otherScalar.getValue();
            }
            return new Vector(values);
        }
        else if (other instanceof Vector){
            System.out.println("ERROR");
            return null;
        }
        return null;
    }

    @Override
    public Var sub(Var other) {
        return null;
    }

    @Override
    public Var mul(Var other) {
        return null;
    }

    @Override
    public Var div(Var other) {
        return null;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
