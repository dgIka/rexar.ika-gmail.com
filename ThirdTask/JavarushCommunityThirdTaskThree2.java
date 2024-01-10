import java.util.Scanner;

public class JavarushCommunityThirdTaskThree2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 1;
        double b = 1;
        while (b != 0) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b != 0){
            System.out.println(a / b);
            } else break;
        }
    }
}
