// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

package HW3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер списка => ");
        Integer n = scan.nextInt();
        for (int i = 0; i <n; i++){
            int num = rnd.nextInt(-100, 100);
            list.add(num);
        }
        System.out.printf("Исходный список %s ", list);
        System.out.println();
        
        int min = list.get(0);
        int max = list.get(0);
        int arif = 0;
        int lenght = list.size();
        for (Integer i: list){
            if (i < min) min = i;
            if (i > max) max = i;
            arif += i;
        }
    
        System.out.println("Минимальное число => " + min);
        System.out.println("Максимальное число => " + max);
        System.out.println("Cреднее арифметическое => " + arif/lenght);
    }
}
    
