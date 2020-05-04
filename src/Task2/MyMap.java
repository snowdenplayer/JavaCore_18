package Task2;

import java.util.*;

public class MyMap <K,V> {
    private Set<MyEntry<K, V>> maps = new HashSet<>();

    public void addInMap(MyEntry<K, V> element){
        maps.add(element);

    }
    public void removeByKey(K key){
        for (MyEntry<K, V> entry : maps) {
            if (entry.getKey().equals(key)) {
                maps.remove(entry);
                return;
            }
        }
        System.out.println("Key is absent");
    }

    public void removeByValue(K val){
        for (MyEntry<K, V> entry : maps) {
            if (entry.getValue().equals(val)) {
                maps.remove(entry);
                return;
            }
        }
        System.out.println("This value is absent");
    }
    public void showByKey(){
        Iterator<MyEntry<K,V>> iterator= maps.iterator();
        MyEntry<K,V> temp;
        while (iterator.hasNext()){
            temp=iterator.next();
            System.out.println(temp.getKey());
        }
    }

    public void showByValue(){
        Iterator<MyEntry<K,V>> iterator= maps.iterator();
        MyEntry<K,V> temp;
        while (iterator.hasNext()){
            temp=iterator.next();
            System.out.println(temp.getValue());
        }
    }

    public void showAll(){
        for (MyEntry<K,V> tmp : maps){
            System.out.println(tmp);
        }
    }
}

