package Homework_Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        filerPositiveNumbers(intList);
        filterEvenNumbers(intList);
        sortNumbers(intList);
    }

    public static void sortNumbers(List<Integer> numbers){
        for(int i = 0; i < numbers.size() - 1; i++){
            for(int j = 0; j < numbers.size() - 1; j++){
                if(numbers.get(j) > numbers.get(j + 1)){
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        System.out.println("Отсортированый список");
        System.out.println(numbers);
    }

    public static void filterEvenNumbers(List<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("Список из четных чисел");
        System.out.println(numbers);
    }

    public static void filerPositiveNumbers(List<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) <= 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("Список из положительных чисел");
        System.out.println(numbers);
    }
}
