import java.util.HashMap;
import java.util.Map;

public class Phones {
    Map<String, String> phones = new HashMap<>();
    void addContact(String phone, String name){
        phones.put(phone, name);
    }

    String printPhonesBook (){
        StringBuilder res = new StringBuilder();
        for(Map.Entry<String, String> entry: phones.entrySet()){
            String phoneNum = entry.getKey();
            String name = entry.getValue();
            res.append(phoneNum);
            res.append(": ");
            res.append(name);
            res.append("\n");
        }
return res.toString();
    }
}

