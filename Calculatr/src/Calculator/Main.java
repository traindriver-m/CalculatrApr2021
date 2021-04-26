package Calculator;

import java.util.Scanner;

public class Main { // Основной класс

    public static void main(String[] args) {
        System.out.println("Калькулятор принимает любые целые арабские числа и римские числа от 1 до 10.");
        while (true) {
            System.out.println("Введите пример.");
            String string = new Scanner(System.in).nextLine();
            Splitter.setParcer(string);
        }
    }
}