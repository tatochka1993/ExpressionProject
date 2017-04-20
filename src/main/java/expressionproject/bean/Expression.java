package expressionproject.bean;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Expression {

    @XmlElement
    private double number1;
    @XmlElement
    private double number2;
    @XmlElement
    private String operation;

    public Expression() {
    }

    public Expression(double number1, double number2, String operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expression that = (Expression) o;

        if (Double.compare(that.number1, number1) != 0) return false;
        if (Double.compare(that.number2, number2) != 0) return false;
        return operation.equals(that.operation);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(number1);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(number2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + operation.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", operation='" + operation + '\'' +
                '}';
    }
}
