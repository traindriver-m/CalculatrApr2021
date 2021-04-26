package Calculator;

public class ArabToRome { //Класс переводит ответ из арабсикх цифр в римские и выводит результат на печать.
    public static void convertedAtoR(int innumber) {
        String rome1 = null;
        String rome2 = null;
        String romeresult = null;
        if (innumber < 10) {
            for (Romes s : Romes.values()) {
                if ((s.ordinal() + 1) == innumber) {
                    romeresult = s.name();
                }
            }
        }
        if (innumber >= 10 && innumber <= 100) {
            int dozen = innumber / 10;
            int ostatok = innumber % (dozen * 10);

            for (Romes s : Romes.values()) {
                if ((s.ordinal() + 1) == ostatok) {
                    rome2 = s.name();
                }
            }

            for (RomeDozen d : RomeDozen.values()) {
                if ((d.ordinal() + 1) == dozen) {
                    rome1 = d.name();
                }
            }
            if (rome2 != null) {
                romeresult = (rome1 + rome2);
            } else {
                romeresult = (rome1);
            }

        }
        if (romeresult != null) {
            System.out.println("Ответ: " + romeresult);
        } else System.err.println("Ответ в римских числах не может быть 0 или отрицательным числом!");
    }
}

