import java.util.Scanner;

public class JavarushCommunitySecongTaskTwo {
    public static void main(String[] args) {
        System.out.println("Первая задача");
        Scanner scanner = new Scanner(System.in);
        int с = scanner.nextInt();
        if (с >= 1 && с <= 4 && с > 0) {
            System.out.println("Малоэтажный дом");
        } else if (с >= 5 && с <= 8 && с > 0) {
            System.out.println("Среднеэтажный дом");
        } else if (с >= 9 && с > 0) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
        System.out.println();
        System.out.println("Вторая задача");

        System.out.println("Введите 2 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            for (int i = b + 1; i < a; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        } if (b > a) {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Третья задача");
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        while (e < f) {
            e = e + 1;
            if (e % 5 == 0 && e % 10 != 0) {
                System.out.print(e + " ");
            }
        }
        while (f < e) {
            f = f + 1;
            if (f % 5 == 0 && f % 10 != 0) {
                System.out.print(f + " ");
            }
        }
        System.out.println();
        System.out.println("Четвертая задача");

        double x = scanner.nextDouble();
        double y;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if ( x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
        } else {
            y = 420;
        }
        System.out.println(y);
    }
}
