public class Lesson_1 {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = -4;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 150;

        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 10) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 20;
        int b = 50;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkIfPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число или ноль");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void flipArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }

    public static int[] createArrayWithInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumInRange(7, 5));  // true
        System.out.println(checkSumInRange(3, 8));  // false

        checkIfPositiveOrNegative(5);
        checkIfPositiveOrNegative(-3);
        checkIfPositiveOrNegative(0);

        System.out.println(isNegative(5));   // false
        System.out.println(isNegative(-3));  // true
        System.out.println(isNegative(0));   // false

        printStringMultipleTimes("Привет Java", 3);

        System.out.println(isLeapYear(2024));  // true
        System.out.println(isLeapYear(1900));  // false
        System.out.println(isLeapYear(2000));  // true

        int[] arr1 = {1, 0, 1, 0, 1, 1};
        flipArrayElements(arr1);
        for (int el : arr1) {
            System.out.print(el + " ");
        }
        System.out.println();

        int[] arr4 = createArrayWithInitialValue(5, 7);
        for (int el : arr4) {
            System.out.print(el + " ");
        }
    }
}