/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo12;

import java.util.Scanner;

/**
 *
 * @author Qngdjas
 */
public class KPO12 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String inputStr = inputString();
        System.out.println(numSum(inputStr));
    }

    /**
     * Функция ввода данных с консоли
     *
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
     *
     * @param str
     * @return
     */
    public static int numSum(String str) {
        String[] strMass = str.split(" ");
        int sum = 0;
        for (int i = 0; i < strMass.length; i++) {
            sum += Integer.parseInt(strMass[i]);
        }
        return sum;
    }
}
