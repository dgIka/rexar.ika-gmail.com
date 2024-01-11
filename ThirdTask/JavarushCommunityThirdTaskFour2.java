import java.util.Random;
import java.util.Scanner;

public class JavarushCommunityThirdTaskFour2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(10000);
        }
        int max = numbers[0];
        int min = numbers[0];
        int countTen = 0;
        int sumTen = 0;
        for (int a: numbers) {
            if (a > max){
                max = a;
            }
            if (a < min) {
                min = a;
            }
            if (a % 10 == 0) {
                countTen++;
                sumTen += a;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(countTen);
        System.out.println(sumTen);
    }
}
