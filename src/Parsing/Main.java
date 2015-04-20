package Parsing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.start();
    }
    public void start () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
        char[] number = scan.next().toCharArray();
        int a = 0;
        int b;
        for (int i = 0; i < number.length; i++) {
            b = parse(number[i]);
            if (b == 10) {
                System.out.println("Вы ввели не корректное число");
                System.exit(0);
            }
            else {
                a = a + (b * (int)Math.pow(10, (number.length-i-1)));
            }
        }
        System.out.print("Вы ввели: " + a);
    }
    public int parse (char digit) {
        int x = 10;
        switch (digit) {
            case '0':
                x = 0;
                break;
            case '1':
                x = 1;
                break;
            case '2':
                x = 2;
                break;
            case '3':
                x = 3;
                break;
            case '4':
                x = 4;
                break;
            case '5':
                x = 5;
                break;
            case '6':
                x = 6;
                break;
            case '7':
                x = 7;
                break;
            case '8':
                x = 8;
                break;
            case '9':
                x = 9;
                break;
        }
        return x;
    }
}
