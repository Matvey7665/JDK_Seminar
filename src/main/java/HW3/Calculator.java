package HW3;

public class Calculator {

    public static  <T extends Number> T sum(T a,T b){
        Double sum = a.doubleValue() + b.doubleValue();
        return (T) sum;
    }
    public static  <T extends Number> T multiply(T a,T b){
        Double multiply = a.doubleValue() * b.doubleValue();
        return (T) multiply;
    }
    public static  <T extends Number> T divide(T a,T b){
        Double dev = a.doubleValue() / b.doubleValue();
        return (T) dev;
    }
    public static  <T extends Number> T subtract(T a,T b){
        Double subtract = a.doubleValue() - b.doubleValue();
        return (T) subtract;
    }




}
