import java.util.*;

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T ... elements) {
        ArrayList list = new ArrayList<>();
        for(T element: elements) {
            list.add(element);
        }
        //напишите тут ваш код
        return list;
    }

    public static <T> HashSet<T> newHashSet(T ... elements) {
        HashSet set = new HashSet<>();
        for(T object : elements) {
            set.add(object);
        }
        //напишите тут ваш код
        return set;
    }

    public <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values)  {
        HashMap<K, V> map = new HashMap<>();
        if(keys.size() == values.size()) {
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
        }else
            throw new IllegalArgumentException();
        return map;
    }
}