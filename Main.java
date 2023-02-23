package OOP.HW.HW_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Notebook> list = new ArrayList<>();
    Macbook macbook = new Macbook("Macbook",
        8, 256, "macOS", false, "midnight");
    Macbook macbookPro = new Macbook("MacbookPro",
        16, 512, "macOS", true, "silver");
    Samsung samsung = new Samsung("Samsung",
        16, 256, "windows", true, "65W", true);
    Dell dell = new Dell("Dell",
        8, 512, "windows", "blue", true, true, "100W");
    HP hp = new HP("HP",
        8, 256, "windows", true,  "65W");
    list.add(macbook);
    list.add(macbookPro);
    list.add(samsung);
    list.add(dell);
    list.add(hp);

    NotebookIterator<Notebook> iterator = new NotebookIterator<>(list);
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

    System.out.printf("Рекомендация магазина - " + macbookPro.getName());
  }

}
