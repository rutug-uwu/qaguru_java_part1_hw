public class Main {

    public static void main(String[] args){

        //0 - Применение арифетических операций над примитивами типа int

        int a = 10;
        int b = 3;

        int sumResult = a + b;
        int diffResult = a - b;
        int mulResult  = a * b;
        int divResult = a / b;
        int modResult = a % b;

        System.out.println("Итог суммирования a и b: " + sumResult);
        System.out.println("Итог вычитания a и b: " + diffResult);
        System.out.println("Итог умножения a и b: " + mulResult );
        System.out.println("Итог деления a и b: " + divResult );
        System.out.println("Итог поиска остатка от деления a и b: " + modResult );

        //1 - Применение арифетических операций над int и double в одном выражении

        int c = 5;
        double d = 3.6;

        int intSum = (int) (c + d);
        double doubleSum = c + d;

        System.out.println("Итог суммирования с и d с отбрасыванием дробной части: " + intSum);
        System.out.println("Итог суммирования с и d: " + doubleSum);

        //2 - Применение операторов сравнения без/с логическими операторами

        int e = 50;
        int f = 250;
        int g = 500;

        boolean greater = (e > f);
        boolean less = (e < f);
        boolean areEqual = (e == f);

        System.out.println("e больше чем f?: " + greater);
        System.out.println("e меньше чем f?: " + less);
        System.out.println("e и f равны?: " + areEqual);

        if (e > g && f > g){
            System.out.println("Переменные e и f больше чем переменная g");
        } else {
            System.out.println("Переменные e и f меньше чем переменная g");
        }


        // 3 - диапазоны типов данных для вещественных / чисел с плавающей точкой

        System.out.println("Минимальное значение для типа Float = " + Float.MIN_VALUE);
        System.out.println("Максимальное значение для типа Float = " + Float.MAX_VALUE);
        System.out.println("Минимальное значение для типа Float = " + Double.MIN_VALUE);
        System.out.println("Максимальное значение для типа Float = " + Double.MAX_VALUE);

        // 4 - получить переполнение при арифметической операции

        float floatMaxValue = Float.MAX_VALUE;
        float floatOverflow = floatMaxValue * 2;
        System.out.println(floatOverflow);

        int intMaxValue = Integer.MAX_VALUE;
        int intOverflow = intMaxValue +1;
        System.out.println(intOverflow);
    }
}
