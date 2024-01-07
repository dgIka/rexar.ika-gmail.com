
public class JavarushCommunitySecondTaskOne {
    public static void main(String[] args) {
        String a = "JAVA";
        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
        }
        int c = 1980;
        while (c <= 2020) {
            System.out.println("Олимпиада " + c + " года");
            c = c + 4;
        }
        System.out.println();
        for (int i = 1980; i <= 2020 ; i+=4) {
            System.out.println("Олимпиада " + i + " года");
        }
    }



}