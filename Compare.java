package nhi5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Compare {
    static int n = 100000;
    public static void main(String[] args) {
        arrayListvslinkedList();
    }
    public static void arrayListvslinkedList(){
        Integer[] array = new Integer[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();

        for (int i = 0; i <arrayList.size(); i++)
        {
            arrayList.get(50000);
        }
        System.out.println("ArrayList: "+(System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i <linkedList.size() ; i++)
        {
            linkedList.get(50000);
        }
        System.out.println("LinkedList: "+(System.nanoTime() - start)/1000000.0 + " ms");
        start = System.nanoTime();
        for (int i = 0; i <arrayList.size() ; i++)
        {
            arrayList.remove(50000);
        }
        System.out.println("ArrayList: "+(System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i <linkedList.size() ; i++)
        {
            linkedList.remove(50000);
        }
        System.out.println("LinkedList: "+(System.nanoTime() - start)/1000000.0 + " ms");
        start = System.nanoTime();
        for (Object item : arrayList) {
            Object x = item;
        }
        System.out.println("ArrayList: " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (Object item : linkedList) {
            Object x = item;
        }
        System.out.println("LinkedList: " + (System.nanoTime() - start)/1000000.0 + " ms");
    }
}
