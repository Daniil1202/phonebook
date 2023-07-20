import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class phone {
     public static void main(String[] args) {
        HashMap <String, ArrayList<Integer>> book = new HashMap<>();
        Scanner sc = new Scanner( System.in, "Cp776");
        while(true){
            System.out.println("Введите 1, чтобы добавить номер, 2 , чтобы ввести все записи, 3, чтобы завершить работу");
            int com = sc.nextInt();
            sc.nextLine();
            if (com == 1) {
                add (book,sc);
            }
            if (com == 2) {
                 printall(book);
            }
            if (com == 3) {
                break;
            }
            
        }
    sc.close();
}
public static void add( HashMap <String, ArrayList<Integer>> book, Scanner sc ){
    System.out.println("Введите фамилию : ");
    String name = sc.nextLine();
    System.out.println("Введите номер: ");
    int num = sc.nextInt();
    if(! book.constainKey(name)){
        book.put(name, new ArrayList<>());
    }
    book.get(name).add(num);
    public static void printall(HashMap <String, ArrayList<Integer>> book){
        book.entrySet(). forEach(entrySet -> {
            System.out.println((entry.getKey() + ":" + entry.getValue().toString().replaceAll("\\[","").replaceAll("\\]","")));
        });
    }
}
}