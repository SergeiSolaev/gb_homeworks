import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", new ArrayList<>());
        phoneBook.put("Петров", new ArrayList<>());
        phoneBook.put("Сидоров", new ArrayList<>());

        phoneBook.get("Иванов").add("876543212");
        phoneBook.get("Иванов").add("123443212");

        phoneBook.get("Петров").add("876543212");
        phoneBook.get("Петров").add("867843333");
        phoneBook.get("Петров").add("876543111");

        phoneBook.get("Сидоров").add("123443212");

        List list = new ArrayList(phoneBook.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,ArrayList<String>>>(){
            @Override
            public int compare(Map.Entry<String,ArrayList<String>> o1, Map.Entry<String,ArrayList<String>> o2) {
                return o2.getValue().size()- o1.getValue().size();
            }
        });

        for (int i = 0; i < list.size() ; i++) {
            String contact = list.get(i).toString().split("=")[0];
            System.out.println(contact+phoneBook.get(contact));
        }

    }
}
