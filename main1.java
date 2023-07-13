public class main1 {
//    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
public static void main(String[] args) {
    Phones phoneBook = new Phones();
    phoneBook.addContact("8980790059", "Михаил Бакин");
    phoneBook.addContact("8978597575", "Павел Иванов");
    phoneBook.addContact("8970509705", "Олег Сидоров");
    phoneBook.addContact("8959705090", "Иван Петров");
    phoneBook.addContact("8950600544", "Михаил Бакин");
    phoneBook.addContact("8940604064", "Иван Петров");
    System.out.println(phoneBook.printPhonesBook());
}
}
