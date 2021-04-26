package Calculator;

public class RomeToArab { //Класс конвертирует входящие римские числа (от 1 до 10) в арабские
    public static void convertedRtoA() {
        for (Romes s : Romes.values()) {
            if (s.name().equals(Splitter.stringSplit[0])) {
                Splitter.a = (s.ordinal() + 1);
            }
        }
        for (Romes s : Romes.values()) {
            if (s.name().equals(Splitter.stringSplit[1])) {
                Splitter.b = (s.ordinal() + 1);
            }

        }
    }
}