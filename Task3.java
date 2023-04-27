/* Напишите постфиксный калькулятор. Пользователь вводит данные и операции в 
обратной польской записи. Калькулятор вычисляет результат и проверяет, что в 
стэке получилось единственное число.

Например:
5 4 3 - + => 5 1 + => 6 */
package Homework4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static int PostFixCalc(LinkedList<Integer> numbers, LinkedList<Character> operations){
        while (numbers.size() > 1 & operations.size() > 0){
            int b = numbers.remove(numbers.size()-1);
            int a = numbers.remove(numbers.size()-1);
            char op = operations.remove(0);
            switch (op){
                case '+':
                    numbers.add(a+b);
                    //System.out.println(a+b);
                    break;
                case '-':
                    numbers.add(a-b);
                    //System.out.println(a-b);
                    break;
                case '*':
                    numbers.add(a*b);
                    //System.out.println(a*b);
                    break;
                case '/':
                    if (b != 0) {
                        numbers.add(a/b);
                        // System.out.println(a/b);
                        break;}
                    else {
                        System.out.println("Division by zero");
                        return 0;}
                } 
                if (numbers.size() > 1 & operations.size() == 0) {
                    System.out.println("Ошибка");
                    return 0;
                }
        }
        return numbers.get(0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"866");
        System.out.println("Что вычисляем? ");
        String mathExpresion = scanner.nextLine();
        scanner.close();
        
        String [] parts = mathExpresion.split("");
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Character> operations = new LinkedList<>();
        for (int i = 0; i < parts.length; i++) {
            try {
                numbers.add(Integer.parseInt(parts[i]));
            } catch (Exception ex) {
                operations.add(parts[i].charAt(0));
            }
        }
        // System.out.println(numbers);
        // System.out.println(operations);
        int result = PostFixCalc(numbers,operations);
        System.out.println(result);
        } 
        
    }

