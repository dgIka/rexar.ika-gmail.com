import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class JavarushCommunityThirdTaskFour1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        Random rnd = new Random();
        int countEight = 0;
        int countOne = 0;
        int countTwo = 0;
        int countNotTwo = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = rnd.nextInt(11);
        }
            for (int a : numbers) {
                System.out.print(a + " ");
                if (a > 8){
                    countEight++;
                }
                if (a == 1) {
                    countOne++;
                }
                if ( a % 2 == 0) {
                    countTwo++;
                } else countNotTwo++;
                sum += a;
        }
        System.out.println();
        System.out.println("Длина массива " + numbers.length);
        System.out.println("Чисел больше 8: " + countEight);
        System.out.println("Единиц в массиве: " + countOne);
            System.out.println("Четных чисел в массива: " + countTwo);
            System.out.println("Нечетных чисел в массиве: " + countNotTwo);
            System.out.println("Сумма всех чисел массива: " + sum);



        }

    }

