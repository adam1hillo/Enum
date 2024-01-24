import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persoon persoon = new Persoon("John", "Doe", Geslacht.MAN);
        System.out.println(persoon);

    }
}
