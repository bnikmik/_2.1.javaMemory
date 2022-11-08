import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static void task1() {
        int value = 33;
        changeValueInt(22);
        System.out.println("value = " + value);
    }

    private static void changeValueInt(int value) {
        value = 22;
    }

    private static void changeValueInt(Integer value) {
        value = 22;
    }

    private static void task2() {
        Integer value = 33;
        changeValueInt(22);
        System.out.println("value = " + value);
    }

    private static void task3() {
        Integer[] value = new Integer[]{3, 4};
        changeValueArr1(value);
        System.out.println(Arrays.toString(value));
    }

    private static void changeValueArr1(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    private static void task4() {
        Integer[] value = new Integer[]{3, 4};
        changeValueArr2(value);
        System.out.println(Arrays.toString(value));
    }

    private static void changeValueArr2(Integer[] value) {
        value[0] = 99;
    }


    private static void task5() {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person.toString());
    }

    private static void changePerson(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }

    private static void task6() {
        int a = -3;
        int b = 4;
        System.out.println("a= " + a + " b= " + b);
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a + " b= " + b);
    }

    private static void checkParty(int count, boolean isWeekend) {
        if (count >= 15 && count <= 20 && !isWeekend) {
            System.out.println(true);
        } else if (count >= 15 && isWeekend) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void task7() {
        boolean isWeekend = true;
        checkParty(70, true);
    }

    private static void great6(int num1, int num2) {
        if (num1 == 6 || num2 == 6 || num1 + num2 == 6 || Math.abs(num1 - num2) == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void task8() {
        great6(1, 7);
    }

    private static int teenSum(int a, int b) {
        if (a + b >= 13 && a + b <= 19) {
            return 19;
        } else return a + b;
    }

    private static void task9() {
        System.out.println(teenSum(13, 2));
    }

    private static void has77(int[] arr) {
        boolean result = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 7 && arr[i - 1] == 7) {
                System.out.println(true);
                result = true;
            } else if (i >= 2 && arr[i] == 7 && arr[i - 2] == 7) {
                result = true;
            } else {
                result = false;
            }
        }
        System.out.println(result);
    }

    private static void task10() {
        has77(new int[]{1, 7, 1, 1, 7});
    }

    private static void twoTwo(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==2) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    private static void task11() {
        twoTwo(new int[]{4, 2, 2, 2});
    }

    private static void task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четное положительное число число: ");
        if (scanner.hasNextInt()) {
            int[] arr = new int[scanner.nextInt()];
            Random random = new Random();
            int sumRight = 0;
            int sumLeft = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(-5, 6);
                if (arr[i] > 0) {
                    sumRight += arr[i];
                } else {
                    sumLeft += Math.abs(arr[i]);
                }
            }
            System.out.println(Arrays.toString(arr));
            if (sumRight > sumLeft) {
                System.out.println("Сумма правых чисел больше");
            } else if (sumLeft > sumRight) {
                System.out.println("Сумма левых чисел больше");
            } else {
                System.out.println("Суммы сторон равны");
            }
        } else {
            System.out.println("Вы ввели некорректное число");
        }
    }

    private static void task13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четное положительное число: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.print("Введите верное число: ");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
    }
}