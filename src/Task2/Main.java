package Task2;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();
        map.addInMap(new MyEntry<>("Hello", 99));
        map.addInMap(new MyEntry<>("Java", 120));
        map.addInMap(new MyEntry<>("Logos", 9));
        map.addInMap(new MyEntry<>("Student", 29));
        map.removeByKey("Java");
        map.removeByValue("9");
        map.removeByKey("This key is absent");
        map.removeByValue("12");
        map.showByKey();
        map.showByValue();
        System.out.println();
        map.showAll();
    }
}
