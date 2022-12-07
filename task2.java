// Пусть дан произвольный список целых чисел, удалить из него четные числа

package HW3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
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
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s", list);
    }
}
    

