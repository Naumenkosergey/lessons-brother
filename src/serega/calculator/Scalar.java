package serega.calculator;

public class Scalar extends Var implements Operation {

    private double value;

    public Scalar() {
    }

    public Scalar(double value) {
        this.value = value;
    }
    public Scalar(Scalar scalar) {
        this.value = scalar.getValue();
    }

    public Scalar(String text) {
        this.value = Double.parseDouble(text);
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public Var add(Var other) {

        if (other instanceof Scalar otherScalar)
        {
            double result = value + otherScalar.getValue();
            return new Scalar(result);
        }
        else if (other instanceof Vector otherVector)
        {
            Vector result = (Vector) otherVector.add(this);
            return new Vector(result);
        }

        return null;
    }

    @Override
    public Var sub(Var other) {

        if (other instanceof Scalar otherScalar)
        {
            double result = value - otherScalar.getValue();
            return new Scalar(result);

        }
        return null;
    }

    @Override
    public Var mul(Var other) {

        if (other instanceof Scalar otherScalar)
        {
            double result = value * otherScalar.getValue();
            return new Scalar(result);
        }
        return null;
    }

    @Override
    public Var div(Var other) {

        if (other instanceof Scalar otherScalar)
        {
            double result = value / otherScalar.getValue();
            return new Scalar(result);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Scalar{" +
                "value=" + value +
                '}';
    }
}
