import java.util.Scanner;
public class Choises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.println("1. Gå hem");
        System.out.println("2. Stanna kvar i skolan");

        int choise = scanner.nextInt();
        if (choise == 1) {
            System.out.println("Du går hem");
        } else if (choise == 2) {
            System.out.println("Du stannar kvar i skolan");
        } else {
            System.out.println("Det är inte ett godkänt val");
        }
    }
}
