package Calculator;

import java.util.Locale;

class Splitter { // класс,  разделяющий строку и обрабатывающий вводные и исключения.
    public static char action;
    public static int a;
    public static int b;
    public static String[] stringSplit;


    public static void setParcer(String s) {
        Number number = new Number();
        stringSplit = s.split("\\+|-|/|\\*");
        if (s.isEmpty()) {
            System.err.println("Введите уже что нибудь)");
            return;
        }
        if (stringSplit.length > 2) {
            System.err.println("Это не инженерный калькулятор! Давайте ограничимся одним действием)");
            return;
        }
        try {
            action = s.charAt(stringSplit[0].length());
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Введите коректный знак операции!");
            return;
        }

        try {

            if (Romes.valueOf(stringSplit[0]).name().equals(stringSplit[0]) && Romes.valueOf(stringSplit[1]).name().equals(stringSplit[1])) {
                RomeToArab.convertedRtoA();
                number.calculated();
                ArabToRome.convertedAtoR(number.result);
                return;
            }
        } catch (IllegalArgumentException e) {
        }
        try {
            a = Integer.parseInt(stringSplit[0].replace(" ", ""));
            b = Integer.parseInt(stringSplit[1].replace(" ", ""));
            number.calculated();
            System.out.println("Ответ: " + number.result);
        } catch (NumberFormatException c) {
            System.err.println("Некорректный ввод!");

        }

    }
}




