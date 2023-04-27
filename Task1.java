/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
который вернет “перевернутый” список. */
package Homework4;

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    
    public static LinkedList<Integer> ConvertList(LinkedList<Integer> list){
        LinkedList<Integer> convertList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            convertList.add(list.get(list.size()-1-i));
        }
        return convertList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> listToConvert = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(10,20); i++) {
            listToConvert.add(i, random.nextInt(20));
        }
        System.out.println(listToConvert);
        LinkedList<Integer> listAfterConvert = ConvertList(listToConvert);
        System.out.println(listAfterConvert);

    }
}
