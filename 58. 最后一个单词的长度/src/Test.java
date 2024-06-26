import java.util.Scanner;

/**
 * Description:
 * Date: 2024-06-26
 * Time: 23:01
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] ss = str.split("");
        int len = ss[ss.length-1].length();
        System.out.println(len);
    }
}
