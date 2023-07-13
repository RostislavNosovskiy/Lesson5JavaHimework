import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class main2 {
//    Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
//    Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
//    Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
//    Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу,
//    которая найдет и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
public static void main(String[] args) {
    String s = " Иван Иванов, Светлана Петрова, Кристина Белова, \n" +
            "Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,\n" +
            " Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, \n" +
            "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";
    s =s.replace(".", "");
    s =s.replace("\n", "");
    String [] names = s.split(",");
    ArrayList <String> firstName = new ArrayList<>();
    for (int i = 0; i< names.length; i++){
        String [] fn = names[i].split(" ");
        firstName.add(fn[1]);
    }
    Map<String, Integer> map = new HashMap<>();
    ListIterator<String> listIterator = firstName.listIterator();
    Integer countOfName = 0;
    while (listIterator.hasNext()) {
        String i = listIterator.next();
        if(map.containsKey(i)){
            countOfName = map.get(i);
            countOfName++;
            map.put(i, countOfName);
        }else{
            map.put(i,1);
        }
    }
    System.out.println(map);


    Map<Integer, List<String>> tree = new TreeMap<>();
    for(String value : map.keySet()){
        if(tree.containsKey(map.get(value))){
            List<String> list = tree.get(map.get(value));
            list.add(value);
            tree.put(map.get(value), list);
        }else {
            List<String> list = new ArrayList<>();
            list.add(value);
            tree.put(map.get(value), list);
        }
    }
    TreeMap<Integer, List<String>> newTree = new TreeMap<Integer, List<String>>(Collections.reverseOrder());
    newTree.putAll(tree);
    System.out.println(newTree);






}
}
