import java.util.Random;

public class JavarushCommunityThirdTaskFour4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rnd = new Random();
        int max = 0;
        int tempMax = 0;
        int counter = 0;
        int[] numbersMaxId = new int[]{0,0,0};
        int[] numbersMax = new int[] {0,0,0};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(10000);
        }
        for (int i = 1; i < numbers.length - 1; i++) {
            tempMax = numbers[i - 1] + numbers[i] + numbers[i + 1];
            if (tempMax > numbersMax[0]) {
                numbersMax[0] = tempMax;
                numbersMaxId[0] = i - 1;
            } else if (tempMax > numbersMax[1]) {
                numbersMax[1] = tempMax;
                numbersMaxId[1] = i;
            } else if (tempMax > numbersMax[2]) {
                numbersMax[2] = tempMax;
                numbersMaxId[2] = i + 1;
            }
        }
        System.out.println(numbersMax[0]);
        System.out.println(numbersMaxId[0]);
        System.out.println(numbersMax[1]);
        System.out.println(numbersMaxId[1]);
        System.out.println(numbersMax[2]);
        System.out.println(numbersMaxId[2]);

    }
}
