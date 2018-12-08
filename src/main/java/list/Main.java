package list;

public class Main {
    public static void main(String[] args){
        LinkedList list1= new LinkedList();
        for (int i = 0; i <10; i++) {
            list1.add("e"+i);
        }

        list1.add("asd",2);
        System.out.println(list1);
        System.out.println(list1.get(2));
        System.out.println(list1.size);
        System.out.println(list1.isEmpty());
        System.out.println(list1.isFull());
        list1.remove(10);
        System.out.println(list1);
        System.out.println(list1.size);


    }
}
