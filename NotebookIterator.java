package OOP.HW.HW_4;

import OOP.Sem.Sem_4.Animal;
import java.util.Iterator;
import java.util.List;

public class NotebookIterator <T extends Notebook> implements Iterator<T> {

  int counter;

  List<T> notebooks;

  @Override
  public boolean hasNext() {
    return counter < notebooks.size();
  }

  @Override
  public T next() {
    return notebooks.get(counter++);
  }

  public NotebookIterator(List<T> notebooks) {
    this.notebooks = notebooks;
  }
}
