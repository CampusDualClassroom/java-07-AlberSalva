package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(15);
        positionInAList(9);
        sumFirstNaturalNumbers(15);
        showFirstNaturalNumbers(5);
    }

    public static void positionInAList(int num) {
        List<Integer> numberList = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            numberList.add(i);
        }
        int index = numberList.indexOf(num);
        if (index < 0){
            System.out.println(num + " no se encuentra en la lista.");
        } else {
            System.out.println(num + " se encuentra en la posición: " + index);
        }

    }

    public static void sumFirstNaturalNumbers(int num) {
        int value = 0;
        for(int i = 1; i <= num; i++){
            value += i;
        }
        System.out.println("La suma es: " + value);
    }

    public static void showFirstNaturalNumbers(int num) {
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }

}
