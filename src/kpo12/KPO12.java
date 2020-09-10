/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo12;

import java.util.Scanner;

/**
 * Консольное приложение позволяет ввести целые числа как аргументы командной строки,
 * подсчитать их суммы и вывести результат на консоль.
 * @author Qngdjas
 */
public class KPO12 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Ввод чисел
        String inputStr = inputString();
        //Вывод суммы через функцию
        System.out.println(numSum(inputStr));
    }

    /**
     * Функция ввода данных с консоли
     * @return Возвращает строку
     */
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        //Считываем информацию с консоли
        String str = sc.nextLine();
        //Возвращаем результат
        return str;
    }

    /**
     * Функция подсчета суммы
     * @param str На вход подается строка с числами, разделенными пробелом
     * @return Возвращает сумму поданных на вход чисел
     */
    public static int numSum(String str) {
        //Строка делится на числа
        String[] strMass = str.split(" ");
        int sum = 0;
        //Числа складываются по очереди
        for (int i = 0; i < strMass.length; i++) {
            sum += Integer.parseInt(strMass[i]);
        }
        //Возврат суммы
        return sum;
    }
}
