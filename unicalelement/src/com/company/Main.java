package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк списка: ");
        int size = sc.nextInt();
        List<String> list = new ArrayList<>(); // инициализация списка
        System.out.println("Введите элементы списка: ");
        for(int i= -1; i<size; i++) {
            list.add(sc.nextLine()); // добавление элементов в список
        }
        HashSet<String> set = new HashSet<>(list); // хранит уникальные значения
        System.out.println("Создан список: "+ list); //вывод нашего списка
        System.out.println("Уникальные элементы: " + set); // вывод уникальных элементов
    }
}
