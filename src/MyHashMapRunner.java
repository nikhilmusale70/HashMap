public class MyHashMapRunner {
    public static void main(String[] args) {
        MyHashMapRunner runner = new MyHashMapRunner();
        runner.givenString();
    }

    public void givenString(){
        String paragraph = "Paranoids are not paranoid because they are paranoid "
                + "but because they keep putting themselves "
                + "deliberately into paranoid avoidable situations";

        MyHashMap<String, Integer> myLinkedHashMap = new MyHashMap<>();
        String[] words = paragraph.toLowerCase().split(" ");
        for( String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) value = 1;
            else value ++;
            myLinkedHashMap.add(word, value);
        }
        System.out.println(myLinkedHashMap);
    }
}