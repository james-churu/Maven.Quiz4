package rocks.zipcode.quiz4.fundamentals;
import java.lang.*;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {

        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {

        Double[] answers =  new Double[value.length];
        int pos = 0;
        for(Double element : value){
            answers[pos] = Math.sqrt(element);
            pos++;
        }

        return answers;
    }

    public static Double[] squares(Double... values) {
        Double[] answers =  new Double[values.length];
        int pos = 0;
        for(Double element : values){
            answers[pos] = element * element;
            pos++;
        }

        return answers;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor / dividend;
    }
}
