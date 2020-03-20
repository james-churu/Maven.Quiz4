package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    HashMap<String , Integer> words =  new HashMap<>();

    public WordCounter(String... strings) {

        for( String element : strings){
            if(words.containsKey(element)){
                words.put(element , words.get(element) + 1);
            }else{
                words.put(element , 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return this.words;
    }
}
