package rocks.zipcode.quiz4.fundamentals;

import com.sun.org.apache.xpath.internal.objects.XStringForChars;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        String answer = "";
        int pos = 0;
        for (Character element : str.toCharArray()){

            if(pos == str.length() / 2){
                String capitalized =  "";
                capitalized += element;
                answer += capitalized.toUpperCase();
                pos++;
            }else{
                answer += element;
                pos++;
            }
        }
        return answer;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String answer = "";
        int pos = 0;
        for (Character element : str.toCharArray()){

            if(pos == str.length() / 2){
                String capitalized =  "";
                capitalized += element;
                answer += capitalized.toLowerCase();
                pos++;
            }else{
                answer += element;
                pos++;
            }
        }
        return answer;
    }

    public static Boolean isIsogram(String str) {

        for(int x = 0;  x <= str.length() -1; x++){
            for(int z = x+1;  z <= str.length() -1; z++){
                if(str.charAt(x) == str.charAt(z)){
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int x = 0;  x <= str.length() -2; x++){
            if(str.charAt(x) == str.charAt(x +1)){
                return true;
            }

        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        String answer = "";
        for(int x = 0;  x <= str.length() -1; x++){

            if(x == str.length() -1){
                answer += str.charAt(x);
            }
            else if(str.charAt(x) != str.charAt(x +1)){
                answer += str.charAt(x);
            }else{
                x++;
            }

        }
        return answer;
    }

    public static String invertCasing(String str) {

        String answer = "";
        for(Character element : str.toCharArray()){
            String temp = "";
            temp += element;

            if(temp.toUpperCase().equals(element.toString())){
                answer += temp.toLowerCase();
            }else if(temp.toLowerCase().equals(element.toString())){
                answer += temp.toUpperCase();
            }
        }
        return answer;
    }
}