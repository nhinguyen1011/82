package nhi5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Compare {
    static int n = 100000;

    public static void main(String[] args) {
        arrayListvslinkedList();
    }

    public static void arrayListvslinkedList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        start = System.nanoTime();
        for (int i = 0; i < n; i++)
        {
            arrayList.add(i);
        }
        System.out.println("ArrayList : " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList: " + (System.nanoTime() - start)/1000000.0 + " ms");

        for (int i = 0; i < n; i++) {
            arrayList.get(n/2);
        }
        System.out.println("ArrayList: " + (System.nanoTime() - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i <n; i++) {
            linkedList.get(n/2);
        }
        System.out.println("LinkedList: " + (System.nanoTime() - start) / 1000000.0 + " ms");
        start = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            arrayList.remove(100000/2);
        }

        System.out.println("ArrayList: " + (System.nanoTime() - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            linkedList.remove(100000/2);
 }
        System.out.println("LinkedList: " + (System.nanoTime() - start) / 1000000.0 + " ms");
    }
}
