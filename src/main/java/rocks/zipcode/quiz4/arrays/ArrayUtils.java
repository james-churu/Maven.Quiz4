package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {

        String[] answer =  new String[values.length -1];
        int x = 0;
        for(String element  : values){
            if(!element.equals(getMiddleElement(values))){
                answer[x] = element;
                x++;
            }
        }
        return answer;
    }

    public static String getLastElement(String[] values) {
        return values[values.length -1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] answer =  new String[values.length -1];
        for(int Z  = 0 ; Z  < values.length -1 ; Z++){
            answer[Z] = values[Z];
        }
        return answer;
    }
}