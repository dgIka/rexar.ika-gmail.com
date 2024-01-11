import java.util.Random;

public class JavarushCommunityThirdTaskFour3 {
    public static void main(String[] args) {
        int[][] numbers = new int[12][8];
        Random rnd = new Random();
        int maxLineInd = 0;
        int maxLine = 0;
        int tempMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rnd.nextInt(50);
                tempMax += numbers[i][j];

                }
            if (tempMax > maxLine){
                maxLine = tempMax;
                maxLineInd = i;
            }
        }
        System.out.println(maxLineInd);

    }
}
