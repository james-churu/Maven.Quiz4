package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    LinkedHashMap<Spice , Integer> spices =  new LinkedHashMap<>();

    public List<Spice> getAllSpices() {

        ArrayList<Spice> spiceList =  new ArrayList<>();
        for(Spice element : spices.keySet()){
            spiceList.add(element);
        }
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        Map<SpiceType , Integer> map = new HashMap<>();

        for(Spice element : spices.keySet()){

            SpiceType spice  = (SpiceType) element.getClass();
            if(map.containsKey(spice)){
                map.replace(spice , map.get(spice), map.get(spice) +1);
            }else{
                map.put(spice,1);
            }
        }
        return map;
    }

    public void applySpice(Spice spice) {

        if(spices.containsKey(spice)){
            spices.put(spice , spices.get(spice) + 1);
        }else{
            spices.put(spice , 1);
        }
    }
}
