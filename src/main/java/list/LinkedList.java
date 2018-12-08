package list;

import java.util.NoSuchElementException;

public class LinkedList implements SdaList {
    Element head;
    Element tail;
    int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        if (tail.getNext() == null){
            return true;
        }
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
        Element newElement = new Element(value);
        Element temp = head;
        if (index < 0 || index >= size){
            throw new NoSuchElementException("Element pod indexem " + index + " nie istnieje");
        }

        int counter = 0;
        while (counter != index -1) {
            temp = temp.getNext();
            counter++;
        }
        newElement.setNext(temp.getNext());
        temp.setNext(newElement);
        size++;

    }

    public String get(int index) {
        if (index < 0 || index >= size){
            throw new NoSuchElementException("Element pod indexem " + index + " nie istnieje");
        }
        Element temp = head;
        int counter = 0;
        while (counter != index){
            temp = temp.getNext();
            counter++;
        }
        return temp.getValue();
    }

    public String remove(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException("Element pod indrexem " + index + " nie istnieje");
        }
        Element temp = head;
        int counter = 0;
        while (counter != index - 1) {
            temp = temp.getNext();
            counter++;
        }
        temp.setNext(temp.getNext().getNext());
        size--;
        return null;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Element tmp = head;
        while (tmp != null){
            result.append(tmp.getValue()).append(", ");
            tmp = tmp.getNext();
        }
        result.append("]");
        return result.toString();
    }
}
