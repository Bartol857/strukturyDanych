package list;

public class LinkedList implements SdaList {
    Element head;
    Element tail;
    int size;

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public void add(String value) {
        Element newElement = new Element(value);
        if (size == 0){
            head = tail = newElement;
        }else {
            tail.setNext(newElement);
            tail = newElement;
        }
        size++;
    }

    public void add(String value, int index) {

    }

    public String get(int index) {
        return null;
    }

    public String remove(int index) {
        return null;
    }
}
