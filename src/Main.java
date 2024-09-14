//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        // Задача №1
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println(" ");
    }

    static void task2() {
        //Задача 2
        int n = 6;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
        }
        System.out.println(multi);
        System.out.println(" ");
    }

    static void task3() {
        int num1 = 1;
        int num2 = 10;
        int result;
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.print(i + "*" + j + "=" + result + " ");
            }
            System.out.println(" ");
        }
    }
}