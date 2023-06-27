import java.util.Scanner;

public class ConfigurationTest {

    public static void main(String[] args) {
        Configuration configuration = null;

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 12) {
            configuration = null;
        }

        if (configuration != null) {
            configuration.getSendEmailToService();

        }

        System.out.println();
    }
}
