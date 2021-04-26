package Calculator;

class Number { // Класс, выполняющий вычисление
    int result = 0;

    public void calculated() {

        char action = Splitter.action;
        int a = Splitter.a;
        int b = Splitter.b;
        if (action == '+') {
            result = a + b;
        }
        if (action == '-') {
            result = a - b;
        }
        if (action == '*') {
            result = a * b;
        }
        if (action == '/') {
            result = a / b;
        }
    }
}
