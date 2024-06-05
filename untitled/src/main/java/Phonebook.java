import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private static HashMap<String, ArrayList<Integer>> Phonebook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

        if (Phonebook.containsKey(name)) {
            Phonebook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(phoneNum);
            Phonebook.put(name, list);
        }
    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        ArrayList<Integer> result = new ArrayList<>();
        if (Phonebook.containsKey(name)) {
            return Phonebook.get(name);
        }
        return new ArrayList<>();
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже
        return Phonebook;
    }

    private static class ArrayList<T> {
    }
}
}
