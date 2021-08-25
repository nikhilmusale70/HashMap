public class MyHashMapRunner {
    public static void main(String[] args) {
        MyHashMapRunner runner = new MyHashMapRunner();
        runner.givenString();
    }

    public void givenString(){
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null) value = 1;
            else value ++;
            myHashMap.add(word, value);
        }
        System.out.println(myHashMap);
    }
}