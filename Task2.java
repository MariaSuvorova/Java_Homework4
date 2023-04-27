/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый 
элемент из очереди и удаляет его, first() - возвращает первый элемент из 
очереди, не удаляя. + size(), isEmpty()*/
package Homework4;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;

public class Task2 {
    public static LinkedList<Integer> EnqueueHandWritten(LinkedList<Integer> list, int elem){
        LinkedList<Integer> listcopy = new LinkedList<>(list);
        listcopy.add(elem);
        return listcopy;
    }
    public static LinkedList<Integer> DequeueHandWritten(LinkedList<Integer> list){
        LinkedList<Integer> listcopy = new LinkedList<>(list);
        System.out.println(listcopy.remove(0));
        return listcopy;
    }
    public static int FirstHandWritten(LinkedList<Integer> list){
        int elem = list.get(0);
        return elem;
    }
    public static boolean IsEmptyHandWritten(LinkedList<Integer> list){
        if (list.contains(null)) return true;
        else  return false;
        }
        
    public static int SizeHandWritten (LinkedList<Integer> list){
        LinkedList<Integer> listcopy = new LinkedList<>(list);
        int size = -1;
        while (!list.contains(null)){
            try {
                size++;
                listcopy.removeFirst();
            } catch (NoSuchElementException ex) {
                break;
            }
        }
        return size;
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> someQueue = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(10,20); i++) {
            someQueue.add(i, random.nextInt(20));
        }
        System.out.println(someQueue);
        System.out.println(EnqueueHandWritten(someQueue,345));
        System.out.println(DequeueHandWritten(someQueue));
        System.out.println(FirstHandWritten(someQueue));
        System.out.println(IsEmptyHandWritten(someQueue));
        System.out.println(SizeHandWritten(someQueue));
    
    }
}
