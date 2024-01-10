import java.util.Scanner;

public class JavarushCommunityThirdTaskThree1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "";
        while (a != "Stop") {
            a = scanner.nextLine();
            switch (a) {
                case ("Москва"):
                case ("Владивосток"):
                case ("Ростов"):
                    System.out.println("Россия");
                    break;
                case ("Рим"):
                case ("Милан"):
                case ("Турин"):
                    System.out.println("Италия");
                    break;
                case ("Ливерпуль"):
                case ("Манчестер"):
                case ("Лондон"):
                    System.out.println("Англия");
                    break;
                case ("Берлин"):
                case ("Мюнхен"):
                case ("Кёльн"):
                case ("Кельн"):
                    System.out.println("Германия");
                    break;
                case ("Stop"):
                    a = "Stop";
                    break;
                default:
                    System.out.println("Введенный город программе неизвестен.");
            }
        }

    }
}
